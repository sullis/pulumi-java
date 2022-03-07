// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.run_v2.enums.GoogleCloudRunOpV2VpcAccessEgress;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VPC Access settings. For more information on creating a VPC Connector, visit https://cloud.google.com/vpc/docs/configure-serverless-vpc-access For information on how to configure Cloud Run with an existing VPC Connector, visit https://cloud.google.com/run/docs/configuring/connecting-vpc
 * 
 */
public final class GoogleCloudRunOpV2VpcAccessArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRunOpV2VpcAccessArgs Empty = new GoogleCloudRunOpV2VpcAccessArgs();

    /**
     * VPC Access connector name. Format: projects/{project}/locations/{location}/connectors/{connector}
     * 
     */
    @InputImport(name="connector")
      private final @Nullable Input<String> connector;

    public Input<String> getConnector() {
        return this.connector == null ? Input.empty() : this.connector;
    }

    /**
     * Traffic VPC egress settings.
     * 
     */
    @InputImport(name="egress")
      private final @Nullable Input<GoogleCloudRunOpV2VpcAccessEgress> egress;

    public Input<GoogleCloudRunOpV2VpcAccessEgress> getEgress() {
        return this.egress == null ? Input.empty() : this.egress;
    }

    public GoogleCloudRunOpV2VpcAccessArgs(
        @Nullable Input<String> connector,
        @Nullable Input<GoogleCloudRunOpV2VpcAccessEgress> egress) {
        this.connector = connector;
        this.egress = egress;
    }

    private GoogleCloudRunOpV2VpcAccessArgs() {
        this.connector = Input.empty();
        this.egress = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRunOpV2VpcAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> connector;
        private @Nullable Input<GoogleCloudRunOpV2VpcAccessEgress> egress;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRunOpV2VpcAccessArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connector = defaults.connector;
    	      this.egress = defaults.egress;
        }

        public Builder setConnector(@Nullable Input<String> connector) {
            this.connector = connector;
            return this;
        }

        public Builder setConnector(@Nullable String connector) {
            this.connector = Input.ofNullable(connector);
            return this;
        }

        public Builder setEgress(@Nullable Input<GoogleCloudRunOpV2VpcAccessEgress> egress) {
            this.egress = egress;
            return this;
        }

        public Builder setEgress(@Nullable GoogleCloudRunOpV2VpcAccessEgress egress) {
            this.egress = Input.ofNullable(egress);
            return this;
        }
        public GoogleCloudRunOpV2VpcAccessArgs build() {
            return new GoogleCloudRunOpV2VpcAccessArgs(connector, egress);
        }
    }
}