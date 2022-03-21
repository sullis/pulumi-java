// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.outputs;

import io.pulumi.azurenative.costmanagement.outputs.ConnectorCollectionErrorInfoResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectorCollectionInfoResponse {
    /**
     * Error information of last collection
     * 
     */
    private final @Nullable ConnectorCollectionErrorInfoResponse error;
    /**
     * Last time the data acquisition process initiated connecting to the external provider
     * 
     */
    private final String lastChecked;
    /**
     * Last time the external data was updated into Azure
     * 
     */
    private final String lastUpdated;
    /**
     * Source timestamp of external data currently available in Azure (eg AWS last processed CUR file timestamp)
     * 
     */
    private final String sourceLastUpdated;

    @CustomType.Constructor
    private ConnectorCollectionInfoResponse(
        @CustomType.Parameter("error") @Nullable ConnectorCollectionErrorInfoResponse error,
        @CustomType.Parameter("lastChecked") String lastChecked,
        @CustomType.Parameter("lastUpdated") String lastUpdated,
        @CustomType.Parameter("sourceLastUpdated") String sourceLastUpdated) {
        this.error = error;
        this.lastChecked = lastChecked;
        this.lastUpdated = lastUpdated;
        this.sourceLastUpdated = sourceLastUpdated;
    }

    /**
     * Error information of last collection
     * 
    */
    public Optional<ConnectorCollectionErrorInfoResponse> getError() {
        return Optional.ofNullable(this.error);
    }
    /**
     * Last time the data acquisition process initiated connecting to the external provider
     * 
    */
    public String getLastChecked() {
        return this.lastChecked;
    }
    /**
     * Last time the external data was updated into Azure
     * 
    */
    public String getLastUpdated() {
        return this.lastUpdated;
    }
    /**
     * Source timestamp of external data currently available in Azure (eg AWS last processed CUR file timestamp)
     * 
    */
    public String getSourceLastUpdated() {
        return this.sourceLastUpdated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorCollectionInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConnectorCollectionErrorInfoResponse error;
        private String lastChecked;
        private String lastUpdated;
        private String sourceLastUpdated;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorCollectionInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
    	      this.lastChecked = defaults.lastChecked;
    	      this.lastUpdated = defaults.lastUpdated;
    	      this.sourceLastUpdated = defaults.sourceLastUpdated;
        }

        public Builder error(@Nullable ConnectorCollectionErrorInfoResponse error) {
            this.error = error;
            return this;
        }
        public Builder lastChecked(String lastChecked) {
            this.lastChecked = Objects.requireNonNull(lastChecked);
            return this;
        }
        public Builder lastUpdated(String lastUpdated) {
            this.lastUpdated = Objects.requireNonNull(lastUpdated);
            return this;
        }
        public Builder sourceLastUpdated(String sourceLastUpdated) {
            this.sourceLastUpdated = Objects.requireNonNull(sourceLastUpdated);
            return this;
        }        public ConnectorCollectionInfoResponse build() {
            return new ConnectorCollectionInfoResponse(error, lastChecked, lastUpdated, sourceLastUpdated);
        }
    }
}
