package testing;

import java.util.*;

public class KMeansPartitioning {

    static class Point {
        double x, y;
        int cluster;

        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        double distance(Point other) {
            return Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2));
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ") -> Cluster " + cluster;
        }
    }

    static class Centroid {
        double x, y;

        Centroid(double x, double y) {
            this.x = x;
            this.y = y;
        }

        void update(List<Point> clusterPoints) {
            double sumX = 0, sumY = 0;
            for (Point p : clusterPoints) {
                sumX += p.x;
                sumY += p.y;
            }
            if (!clusterPoints.isEmpty()) {
                x = sumX / clusterPoints.size();
                y = sumY / clusterPoints.size();
            }
        }

        Point toPoint() {
            return new Point(x, y);
        }
    }

    public static void kMeans(List<Point> points, int k, int maxIterations) {
        Random rand = new Random();
        List<Centroid> centroids = new ArrayList<>();

        // Step 1: Initialize centroids randomly
        for (int i = 0; i < k; i++) {
            Point randomPoint = points.get(rand.nextInt(points.size()));
            centroids.add(new Centroid(randomPoint.x, randomPoint.y));
        }

        for (int iteration = 0; iteration < maxIterations; iteration++) {
            boolean changed = false;

            // Step 2: Assign points to the closest centroid
            for (Point point : points) {
                double minDist = Double.MAX_VALUE;
                int closestCluster = -1;
                for (int i = 0; i < k; i++) {
                    double dist = point.distance(centroids.get(i).toPoint());
                    if (dist < minDist) {
                        minDist = dist;
                        closestCluster = i;
                    }
                }

                if (point.cluster != closestCluster) {
                    point.cluster = closestCluster;
                    changed = true;
                }
            }

            // Step 3: Recompute centroids
            for (int i = 0; i < k; i++) {
                int finalI = i;
                List<Point> clusterPoints = new ArrayList<>();
                for (Point p : points) {
                    if (p.cluster == finalI) clusterPoints.add(p);
                }
                centroids.get(i).update(clusterPoints);
            }

            if (!changed) {
                System.out.println("Converged after " + (iteration + 1) + " iterations.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        // Sample dataset
        List<Point> points = Arrays.asList(
                new Point(1, 2), new Point(2, 3), new Point(3, 3),
                new Point(8, 7), new Point(8, 8), new Point(7, 7),
                new Point(10, 10), new Point(9, 11), new Point(11, 9)
        );

        int k = 5; // Number of clusters
        int maxIterations = 100;

        kMeans(points, k, maxIterations);

        System.out.println("\nFinal Clustering:");
        for (Point point : points) {
            System.out.println(point);
        }
    }
}