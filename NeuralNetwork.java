package testing;

import java.util.Random;

class NeuralNetwork {
    private double[][] weightsInputHidden;
    private double[] weightsHiddenOutput;
    private double[] hiddenLayer;
    private double learningRate = 0.1;

    public NeuralNetwork(int inputSize, int hiddenSize) {
        weightsInputHidden = new double[inputSize][hiddenSize];
        weightsHiddenOutput = new double[hiddenSize];
        hiddenLayer = new double[hiddenSize];
        
        Random rand = new Random();
        for (int i = 0; i < inputSize; i++) {
            for (int j = 0; j < hiddenSize; j++) {
                weightsInputHidden[i][j] = rand.nextDouble() - 0.5;
            }
        }
        for (int j = 0; j < hiddenSize; j++) {
            weightsHiddenOutput[j] = rand.nextDouble() - 0.5;
        }
    }

    private double sigmoid(double x) {
        return 1 / (1 + Math.exp(-x));
    }
    
    private double sigmoidDerivative(double x) {
        return x * (1 - x);
    }

    public double feedForward(double[] inputs) {
        for (int j = 0; j < hiddenLayer.length; j++) {
            double sum = 0;
            for (int i = 0; i < inputs.length; i++) {
                sum += inputs[i] * weightsInputHidden[i][j];
            }
            hiddenLayer[j] = sigmoid(sum);
        }

        double output = 0;
        for (int j = 0; j < hiddenLayer.length; j++) {
            output += hiddenLayer[j] * weightsHiddenOutput[j];
        }
        return sigmoid(output);
    }

    public void train(double[] inputs, double expectedOutput) {
        double output = feedForward(inputs);
        double error = expectedOutput - output;
        
        double[] hiddenErrors = new double[hiddenLayer.length];
        for (int j = 0; j < hiddenLayer.length; j++) {
            hiddenErrors[j] = error * weightsHiddenOutput[j] * sigmoidDerivative(hiddenLayer[j]);
        }
        
        for (int j = 0; j < hiddenLayer.length; j++) {
            weightsHiddenOutput[j] += learningRate * error * hiddenLayer[j];
        }
        
        for (int i = 0; i < weightsInputHidden.length; i++) {
            for (int j = 0; j < weightsInputHidden[i].length; j++) {
                weightsInputHidden[i][j] += learningRate * hiddenErrors[j] * inputs[i];
            }
        }
    }

    public static void main(String[] args) {
        NeuralNetwork nn = new NeuralNetwork(2, 2);
        double[][] trainingData = {
            {0, 0}, {0, 1}, {1, 0}, {1, 1}
        };
        double[] expectedOutputs = {0, 1, 1, 0};
        
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < trainingData.length; j++) {
                nn.train(trainingData[j], expectedOutputs[j]);
            }
        }
        
        for (int j = 0; j < trainingData.length; j++) {
            System.out.println("Input: " + trainingData[j][0] + ", " + trainingData[j][1] + " Output: " + nn.feedForward(trainingData[j]));
        }
    }
}