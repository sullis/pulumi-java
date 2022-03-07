// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.azurenative.securityinsights.inputs.AwsCloudTrailDataConnectorDataTypesResponseLogs;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The available data types for Amazon Web Services CloudTrail data connector.
 * 
 */
public final class AwsCloudTrailDataConnectorDataTypesResponse extends io.pulumi.resources.InvokeArgs {

    public static final AwsCloudTrailDataConnectorDataTypesResponse Empty = new AwsCloudTrailDataConnectorDataTypesResponse();

    /**
     * Logs data type.
     * 
     */
    @InputImport(name="logs")
      private final @Nullable AwsCloudTrailDataConnectorDataTypesResponseLogs logs;

    public Optional<AwsCloudTrailDataConnectorDataTypesResponseLogs> getLogs() {
        return this.logs == null ? Optional.empty() : Optional.ofNullable(this.logs);
    }

    public AwsCloudTrailDataConnectorDataTypesResponse(@Nullable AwsCloudTrailDataConnectorDataTypesResponseLogs logs) {
        this.logs = logs;
    }

    private AwsCloudTrailDataConnectorDataTypesResponse() {
        this.logs = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsCloudTrailDataConnectorDataTypesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AwsCloudTrailDataConnectorDataTypesResponseLogs logs;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsCloudTrailDataConnectorDataTypesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logs = defaults.logs;
        }

        public Builder setLogs(@Nullable AwsCloudTrailDataConnectorDataTypesResponseLogs logs) {
            this.logs = logs;
            return this;
        }
        public AwsCloudTrailDataConnectorDataTypesResponse build() {
            return new AwsCloudTrailDataConnectorDataTypesResponse(logs);
        }
    }
}