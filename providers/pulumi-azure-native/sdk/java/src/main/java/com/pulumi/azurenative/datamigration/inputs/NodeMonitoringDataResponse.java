// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class NodeMonitoringDataResponse extends com.pulumi.resources.InvokeArgs {

    public static final NodeMonitoringDataResponse Empty = new NodeMonitoringDataResponse();

    /**
     *  Unmatched properties from the message are deserialized in this collection.
     * 
     */
    @Import(name="additionalProperties", required=true)
    private Map<String,Object> additionalProperties;

    /**
     * @return  Unmatched properties from the message are deserialized in this collection.
     * 
     */
    public Map<String,Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Available memory (MB) on the integration runtime node.
     * 
     */
    @Import(name="availableMemoryInMB", required=true)
    private Integer availableMemoryInMB;

    /**
     * @return Available memory (MB) on the integration runtime node.
     * 
     */
    public Integer availableMemoryInMB() {
        return this.availableMemoryInMB;
    }

    /**
     * Maximum concurrent jobs on the integration runtime node.
     * 
     */
    @Import(name="concurrentJobsLimit", required=true)
    private Integer concurrentJobsLimit;

    /**
     * @return Maximum concurrent jobs on the integration runtime node.
     * 
     */
    public Integer concurrentJobsLimit() {
        return this.concurrentJobsLimit;
    }

    /**
     * The number of jobs currently running on the integration runtime node.
     * 
     */
    @Import(name="concurrentJobsRunning", required=true)
    private Integer concurrentJobsRunning;

    /**
     * @return The number of jobs currently running on the integration runtime node.
     * 
     */
    public Integer concurrentJobsRunning() {
        return this.concurrentJobsRunning;
    }

    /**
     * CPU percentage on the integration runtime node.
     * 
     */
    @Import(name="cpuUtilization", required=true)
    private Integer cpuUtilization;

    /**
     * @return CPU percentage on the integration runtime node.
     * 
     */
    public Integer cpuUtilization() {
        return this.cpuUtilization;
    }

    /**
     * The maximum concurrent jobs in this integration runtime.
     * 
     */
    @Import(name="maxConcurrentJobs", required=true)
    private Integer maxConcurrentJobs;

    /**
     * @return The maximum concurrent jobs in this integration runtime.
     * 
     */
    public Integer maxConcurrentJobs() {
        return this.maxConcurrentJobs;
    }

    /**
     * Name of the integration runtime node.
     * 
     */
    @Import(name="nodeName", required=true)
    private String nodeName;

    /**
     * @return Name of the integration runtime node.
     * 
     */
    public String nodeName() {
        return this.nodeName;
    }

    /**
     * Received bytes on the integration runtime node.
     * 
     */
    @Import(name="receivedBytes", required=true)
    private Double receivedBytes;

    /**
     * @return Received bytes on the integration runtime node.
     * 
     */
    public Double receivedBytes() {
        return this.receivedBytes;
    }

    /**
     * Sent bytes on the integration runtime node.
     * 
     */
    @Import(name="sentBytes", required=true)
    private Double sentBytes;

    /**
     * @return Sent bytes on the integration runtime node.
     * 
     */
    public Double sentBytes() {
        return this.sentBytes;
    }

    private NodeMonitoringDataResponse() {}

    private NodeMonitoringDataResponse(NodeMonitoringDataResponse $) {
        this.additionalProperties = $.additionalProperties;
        this.availableMemoryInMB = $.availableMemoryInMB;
        this.concurrentJobsLimit = $.concurrentJobsLimit;
        this.concurrentJobsRunning = $.concurrentJobsRunning;
        this.cpuUtilization = $.cpuUtilization;
        this.maxConcurrentJobs = $.maxConcurrentJobs;
        this.nodeName = $.nodeName;
        this.receivedBytes = $.receivedBytes;
        this.sentBytes = $.sentBytes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeMonitoringDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeMonitoringDataResponse $;

        public Builder() {
            $ = new NodeMonitoringDataResponse();
        }

        public Builder(NodeMonitoringDataResponse defaults) {
            $ = new NodeMonitoringDataResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalProperties  Unmatched properties from the message are deserialized in this collection.
         * 
         * @return builder
         * 
         */
        public Builder additionalProperties(Map<String,Object> additionalProperties) {
            $.additionalProperties = additionalProperties;
            return this;
        }

        /**
         * @param availableMemoryInMB Available memory (MB) on the integration runtime node.
         * 
         * @return builder
         * 
         */
        public Builder availableMemoryInMB(Integer availableMemoryInMB) {
            $.availableMemoryInMB = availableMemoryInMB;
            return this;
        }

        /**
         * @param concurrentJobsLimit Maximum concurrent jobs on the integration runtime node.
         * 
         * @return builder
         * 
         */
        public Builder concurrentJobsLimit(Integer concurrentJobsLimit) {
            $.concurrentJobsLimit = concurrentJobsLimit;
            return this;
        }

        /**
         * @param concurrentJobsRunning The number of jobs currently running on the integration runtime node.
         * 
         * @return builder
         * 
         */
        public Builder concurrentJobsRunning(Integer concurrentJobsRunning) {
            $.concurrentJobsRunning = concurrentJobsRunning;
            return this;
        }

        /**
         * @param cpuUtilization CPU percentage on the integration runtime node.
         * 
         * @return builder
         * 
         */
        public Builder cpuUtilization(Integer cpuUtilization) {
            $.cpuUtilization = cpuUtilization;
            return this;
        }

        /**
         * @param maxConcurrentJobs The maximum concurrent jobs in this integration runtime.
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentJobs(Integer maxConcurrentJobs) {
            $.maxConcurrentJobs = maxConcurrentJobs;
            return this;
        }

        /**
         * @param nodeName Name of the integration runtime node.
         * 
         * @return builder
         * 
         */
        public Builder nodeName(String nodeName) {
            $.nodeName = nodeName;
            return this;
        }

        /**
         * @param receivedBytes Received bytes on the integration runtime node.
         * 
         * @return builder
         * 
         */
        public Builder receivedBytes(Double receivedBytes) {
            $.receivedBytes = receivedBytes;
            return this;
        }

        /**
         * @param sentBytes Sent bytes on the integration runtime node.
         * 
         * @return builder
         * 
         */
        public Builder sentBytes(Double sentBytes) {
            $.sentBytes = sentBytes;
            return this;
        }

        public NodeMonitoringDataResponse build() {
            $.additionalProperties = Objects.requireNonNull($.additionalProperties, "expected parameter 'additionalProperties' to be non-null");
            $.availableMemoryInMB = Objects.requireNonNull($.availableMemoryInMB, "expected parameter 'availableMemoryInMB' to be non-null");
            $.concurrentJobsLimit = Objects.requireNonNull($.concurrentJobsLimit, "expected parameter 'concurrentJobsLimit' to be non-null");
            $.concurrentJobsRunning = Objects.requireNonNull($.concurrentJobsRunning, "expected parameter 'concurrentJobsRunning' to be non-null");
            $.cpuUtilization = Objects.requireNonNull($.cpuUtilization, "expected parameter 'cpuUtilization' to be non-null");
            $.maxConcurrentJobs = Objects.requireNonNull($.maxConcurrentJobs, "expected parameter 'maxConcurrentJobs' to be non-null");
            $.nodeName = Objects.requireNonNull($.nodeName, "expected parameter 'nodeName' to be non-null");
            $.receivedBytes = Objects.requireNonNull($.receivedBytes, "expected parameter 'receivedBytes' to be non-null");
            $.sentBytes = Objects.requireNonNull($.sentBytes, "expected parameter 'sentBytes' to be non-null");
            return $;
        }
    }

}
