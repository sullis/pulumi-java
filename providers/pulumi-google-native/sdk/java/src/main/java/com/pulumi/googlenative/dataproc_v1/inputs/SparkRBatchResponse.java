// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A configuration for running an Apache SparkR (https://spark.apache.org/docs/latest/sparkr.html) batch workload.
 * 
 */
public final class SparkRBatchResponse extends com.pulumi.resources.InvokeArgs {

    public static final SparkRBatchResponse Empty = new SparkRBatchResponse();

    /**
     * Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    @Import(name="archiveUris", required=true)
    private List<String> archiveUris;

    /**
     * @return Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    public List<String> archiveUris() {
        return this.archiveUris;
    }

    /**
     * Optional. The arguments to pass to the Spark driver. Do not include arguments that can be set as batch properties, such as --conf, since a collision can occur that causes an incorrect batch submission.
     * 
     */
    @Import(name="args", required=true)
    private List<String> args;

    /**
     * @return Optional. The arguments to pass to the Spark driver. Do not include arguments that can be set as batch properties, such as --conf, since a collision can occur that causes an incorrect batch submission.
     * 
     */
    public List<String> args() {
        return this.args;
    }

    /**
     * Optional. HCFS URIs of files to be placed in the working directory of each executor.
     * 
     */
    @Import(name="fileUris", required=true)
    private List<String> fileUris;

    /**
     * @return Optional. HCFS URIs of files to be placed in the working directory of each executor.
     * 
     */
    public List<String> fileUris() {
        return this.fileUris;
    }

    /**
     * The HCFS URI of the main R file to use as the driver. Must be a .R or .r file.
     * 
     */
    @Import(name="mainRFileUri", required=true)
    private String mainRFileUri;

    /**
     * @return The HCFS URI of the main R file to use as the driver. Must be a .R or .r file.
     * 
     */
    public String mainRFileUri() {
        return this.mainRFileUri;
    }

    private SparkRBatchResponse() {}

    private SparkRBatchResponse(SparkRBatchResponse $) {
        this.archiveUris = $.archiveUris;
        this.args = $.args;
        this.fileUris = $.fileUris;
        this.mainRFileUri = $.mainRFileUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SparkRBatchResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SparkRBatchResponse $;

        public Builder() {
            $ = new SparkRBatchResponse();
        }

        public Builder(SparkRBatchResponse defaults) {
            $ = new SparkRBatchResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param archiveUris Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
         * 
         * @return builder
         * 
         */
        public Builder archiveUris(List<String> archiveUris) {
            $.archiveUris = archiveUris;
            return this;
        }

        /**
         * @param archiveUris Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
         * 
         * @return builder
         * 
         */
        public Builder archiveUris(String... archiveUris) {
            return archiveUris(List.of(archiveUris));
        }

        /**
         * @param args Optional. The arguments to pass to the Spark driver. Do not include arguments that can be set as batch properties, such as --conf, since a collision can occur that causes an incorrect batch submission.
         * 
         * @return builder
         * 
         */
        public Builder args(List<String> args) {
            $.args = args;
            return this;
        }

        /**
         * @param args Optional. The arguments to pass to the Spark driver. Do not include arguments that can be set as batch properties, such as --conf, since a collision can occur that causes an incorrect batch submission.
         * 
         * @return builder
         * 
         */
        public Builder args(String... args) {
            return args(List.of(args));
        }

        /**
         * @param fileUris Optional. HCFS URIs of files to be placed in the working directory of each executor.
         * 
         * @return builder
         * 
         */
        public Builder fileUris(List<String> fileUris) {
            $.fileUris = fileUris;
            return this;
        }

        /**
         * @param fileUris Optional. HCFS URIs of files to be placed in the working directory of each executor.
         * 
         * @return builder
         * 
         */
        public Builder fileUris(String... fileUris) {
            return fileUris(List.of(fileUris));
        }

        /**
         * @param mainRFileUri The HCFS URI of the main R file to use as the driver. Must be a .R or .r file.
         * 
         * @return builder
         * 
         */
        public Builder mainRFileUri(String mainRFileUri) {
            $.mainRFileUri = mainRFileUri;
            return this;
        }

        public SparkRBatchResponse build() {
            $.archiveUris = Objects.requireNonNull($.archiveUris, "expected parameter 'archiveUris' to be non-null");
            $.args = Objects.requireNonNull($.args, "expected parameter 'args' to be non-null");
            $.fileUris = Objects.requireNonNull($.fileUris, "expected parameter 'fileUris' to be non-null");
            $.mainRFileUri = Objects.requireNonNull($.mainRFileUri, "expected parameter 'mainRFileUri' to be non-null");
            return $;
        }
    }

}
