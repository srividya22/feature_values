package us.kbase.clusterservice;

import java.io.IOException;

import us.kbase.common.service.JsonClientException;
import us.kbase.kbasefeaturevalues.EstimateKResult;
import us.kbase.kbasefeaturevalues.FloatMatrix2D;

public interface ClusterServiceLocalClient {
    
    public EstimateKResult estimateK(FloatMatrix2D matrix, Long minK, Long maxK, Long maxIter, Long randomSeed, Long neighbSize) throws IOException, JsonClientException;

    public ClusterResults clusterKMeans(FloatMatrix2D matrix, Long k, Long nStart, Long maxIter, Long randomSeed, String algorithm) throws IOException, JsonClientException;

    public ClusterResults clusterHierarchical(FloatMatrix2D matrix, String distanceMetric, String linkageCriteria, Double heightCutoff, Long processRows) throws IOException, JsonClientException;
    
    public ClusterResults clustersFromDendrogram(FloatMatrix2D matrix, String dendrogram, Double heightCutoff) throws IOException, JsonClientException;
}
