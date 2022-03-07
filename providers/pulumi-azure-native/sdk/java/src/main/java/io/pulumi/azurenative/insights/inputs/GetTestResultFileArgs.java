// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTestResultFileArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTestResultFileArgs Empty = new GetTestResultFileArgs();

    /**
     * The continuation token.
     * 
     */
    @InputImport(name="continuationToken")
      private final @Nullable String continuationToken;

    public Optional<String> getContinuationToken() {
        return this.continuationToken == null ? Optional.empty() : Optional.ofNullable(this.continuationToken);
    }

    /**
     * The format to use when returning the webtest result.
     * 
     */
    @InputImport(name="downloadAs", required=true)
      private final String downloadAs;

    public String getDownloadAs() {
        return this.downloadAs;
    }

    /**
     * The location ID where the webtest was physically run.
     * 
     */
    @InputImport(name="geoLocationId", required=true)
      private final String geoLocationId;

    public String getGeoLocationId() {
        return this.geoLocationId;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The success state criteria for the webtest result.
     * 
     */
    @InputImport(name="testSuccessfulCriteria")
      private final @Nullable Boolean testSuccessfulCriteria;

    public Optional<Boolean> getTestSuccessfulCriteria() {
        return this.testSuccessfulCriteria == null ? Optional.empty() : Optional.ofNullable(this.testSuccessfulCriteria);
    }

    /**
     * The posix (epoch) time stamp for the webtest result.
     * 
     */
    @InputImport(name="timeStamp", required=true)
      private final Integer timeStamp;

    public Integer getTimeStamp() {
        return this.timeStamp;
    }

    /**
     * The name of the Application Insights webtest resource.
     * 
     */
    @InputImport(name="webTestName", required=true)
      private final String webTestName;

    public String getWebTestName() {
        return this.webTestName;
    }

    public GetTestResultFileArgs(
        @Nullable String continuationToken,
        String downloadAs,
        String geoLocationId,
        String resourceGroupName,
        @Nullable Boolean testSuccessfulCriteria,
        Integer timeStamp,
        String webTestName) {
        this.continuationToken = continuationToken;
        this.downloadAs = Objects.requireNonNull(downloadAs, "expected parameter 'downloadAs' to be non-null");
        this.geoLocationId = Objects.requireNonNull(geoLocationId, "expected parameter 'geoLocationId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.testSuccessfulCriteria = testSuccessfulCriteria;
        this.timeStamp = Objects.requireNonNull(timeStamp, "expected parameter 'timeStamp' to be non-null");
        this.webTestName = Objects.requireNonNull(webTestName, "expected parameter 'webTestName' to be non-null");
    }

    private GetTestResultFileArgs() {
        this.continuationToken = null;
        this.downloadAs = null;
        this.geoLocationId = null;
        this.resourceGroupName = null;
        this.testSuccessfulCriteria = null;
        this.timeStamp = null;
        this.webTestName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTestResultFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String continuationToken;
        private String downloadAs;
        private String geoLocationId;
        private String resourceGroupName;
        private @Nullable Boolean testSuccessfulCriteria;
        private Integer timeStamp;
        private String webTestName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTestResultFileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.continuationToken = defaults.continuationToken;
    	      this.downloadAs = defaults.downloadAs;
    	      this.geoLocationId = defaults.geoLocationId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.testSuccessfulCriteria = defaults.testSuccessfulCriteria;
    	      this.timeStamp = defaults.timeStamp;
    	      this.webTestName = defaults.webTestName;
        }

        public Builder setContinuationToken(@Nullable String continuationToken) {
            this.continuationToken = continuationToken;
            return this;
        }

        public Builder setDownloadAs(String downloadAs) {
            this.downloadAs = Objects.requireNonNull(downloadAs);
            return this;
        }

        public Builder setGeoLocationId(String geoLocationId) {
            this.geoLocationId = Objects.requireNonNull(geoLocationId);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setTestSuccessfulCriteria(@Nullable Boolean testSuccessfulCriteria) {
            this.testSuccessfulCriteria = testSuccessfulCriteria;
            return this;
        }

        public Builder setTimeStamp(Integer timeStamp) {
            this.timeStamp = Objects.requireNonNull(timeStamp);
            return this;
        }

        public Builder setWebTestName(String webTestName) {
            this.webTestName = Objects.requireNonNull(webTestName);
            return this;
        }
        public GetTestResultFileArgs build() {
            return new GetTestResultFileArgs(continuationToken, downloadAs, geoLocationId, resourceGroupName, testSuccessfulCriteria, timeStamp, webTestName);
        }
    }
}