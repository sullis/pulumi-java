// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class JobStatistics3Response {
    /**
     * The number of bad records encountered. Note that if the job has failed because of more bad records encountered than the maximum allowed in the load job configuration, then this number can be less than the total number of bad records present in the input data.
     * 
     */
    private final String badRecords;
    /**
     * Number of bytes of source data in a load job.
     * 
     */
    private final String inputFileBytes;
    /**
     * Number of source files in a load job.
     * 
     */
    private final String inputFiles;
    /**
     * Size of the loaded data in bytes. Note that while a load job is in the running state, this value may change.
     * 
     */
    private final String outputBytes;
    /**
     * Number of rows imported in a load job. Note that while an import job is in the running state, this value may change.
     * 
     */
    private final String outputRows;

    @OutputCustomType.Constructor({"badRecords","inputFileBytes","inputFiles","outputBytes","outputRows"})
    private JobStatistics3Response(
        String badRecords,
        String inputFileBytes,
        String inputFiles,
        String outputBytes,
        String outputRows) {
        this.badRecords = Objects.requireNonNull(badRecords);
        this.inputFileBytes = Objects.requireNonNull(inputFileBytes);
        this.inputFiles = Objects.requireNonNull(inputFiles);
        this.outputBytes = Objects.requireNonNull(outputBytes);
        this.outputRows = Objects.requireNonNull(outputRows);
    }

    /**
     * The number of bad records encountered. Note that if the job has failed because of more bad records encountered than the maximum allowed in the load job configuration, then this number can be less than the total number of bad records present in the input data.
     * 
    */
    public String getBadRecords() {
        return this.badRecords;
    }
    /**
     * Number of bytes of source data in a load job.
     * 
    */
    public String getInputFileBytes() {
        return this.inputFileBytes;
    }
    /**
     * Number of source files in a load job.
     * 
    */
    public String getInputFiles() {
        return this.inputFiles;
    }
    /**
     * Size of the loaded data in bytes. Note that while a load job is in the running state, this value may change.
     * 
    */
    public String getOutputBytes() {
        return this.outputBytes;
    }
    /**
     * Number of rows imported in a load job. Note that while an import job is in the running state, this value may change.
     * 
    */
    public String getOutputRows() {
        return this.outputRows;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStatistics3Response defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String badRecords;
        private String inputFileBytes;
        private String inputFiles;
        private String outputBytes;
        private String outputRows;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStatistics3Response defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.badRecords = defaults.badRecords;
    	      this.inputFileBytes = defaults.inputFileBytes;
    	      this.inputFiles = defaults.inputFiles;
    	      this.outputBytes = defaults.outputBytes;
    	      this.outputRows = defaults.outputRows;
        }

        public Builder setBadRecords(String badRecords) {
            this.badRecords = Objects.requireNonNull(badRecords);
            return this;
        }

        public Builder setInputFileBytes(String inputFileBytes) {
            this.inputFileBytes = Objects.requireNonNull(inputFileBytes);
            return this;
        }

        public Builder setInputFiles(String inputFiles) {
            this.inputFiles = Objects.requireNonNull(inputFiles);
            return this;
        }

        public Builder setOutputBytes(String outputBytes) {
            this.outputBytes = Objects.requireNonNull(outputBytes);
            return this;
        }

        public Builder setOutputRows(String outputRows) {
            this.outputRows = Objects.requireNonNull(outputRows);
            return this;
        }
        public JobStatistics3Response build() {
            return new JobStatistics3Response(badRecords, inputFileBytes, inputFiles, outputBytes, outputRows);
        }
    }
}