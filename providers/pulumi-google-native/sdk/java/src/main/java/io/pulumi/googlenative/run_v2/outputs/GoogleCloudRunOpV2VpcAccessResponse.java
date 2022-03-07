// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudRunOpV2VpcAccessResponse {
    /**
     * VPC Access connector name. Format: projects/{project}/locations/{location}/connectors/{connector}
     * 
     */
    private final String connector;
    /**
     * Traffic VPC egress settings.
     * 
     */
    private final String egress;

    @OutputCustomType.Constructor({"connector","egress"})
    private GoogleCloudRunOpV2VpcAccessResponse(
        String connector,
        String egress) {
        this.connector = Objects.requireNonNull(connector);
        this.egress = Objects.requireNonNull(egress);
    }

    /**
     * VPC Access connector name. Format: projects/{project}/locations/{location}/connectors/{connector}
     * 
    */
    public String getConnector() {
        return this.connector;
    }
    /**
     * Traffic VPC egress settings.
     * 
    */
    public String getEgress() {
        return this.egress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRunOpV2VpcAccessResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connector;
        private String egress;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRunOpV2VpcAccessResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connector = defaults.connector;
    	      this.egress = defaults.egress;
        }

        public Builder setConnector(String connector) {
            this.connector = Objects.requireNonNull(connector);
            return this;
        }

        public Builder setEgress(String egress) {
            this.egress = Objects.requireNonNull(egress);
            return this;
        }
        public GoogleCloudRunOpV2VpcAccessResponse build() {
            return new GoogleCloudRunOpV2VpcAccessResponse(connector, egress);
        }
    }
}