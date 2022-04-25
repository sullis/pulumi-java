// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.metastore_v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains information of the customer&#39;s network configurations.
 * 
 */
public final class ConsumerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConsumerArgs Empty = new ConsumerArgs();

    /**
     * The subnetwork of the customer project from which an IP address is reserved and used as the Dataproc Metastore service&#39;s endpoint. It is accessible to hosts in the subnet and to all hosts in a subnet in the same region and same network. There must be at least one IP address available in the subnet&#39;s primary range. The subnet is specified in the following form:`projects/{project_number}/regions/{region_id}/subnetworks/{subnetwork_id}
     * 
     */
    @Import(name="subnetwork")
    private @Nullable Output<String> subnetwork;

    /**
     * @return The subnetwork of the customer project from which an IP address is reserved and used as the Dataproc Metastore service&#39;s endpoint. It is accessible to hosts in the subnet and to all hosts in a subnet in the same region and same network. There must be at least one IP address available in the subnet&#39;s primary range. The subnet is specified in the following form:`projects/{project_number}/regions/{region_id}/subnetworks/{subnetwork_id}
     * 
     */
    public Optional<Output<String>> subnetwork() {
        return Optional.ofNullable(this.subnetwork);
    }

    private ConsumerArgs() {}

    private ConsumerArgs(ConsumerArgs $) {
        this.subnetwork = $.subnetwork;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConsumerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConsumerArgs $;

        public Builder() {
            $ = new ConsumerArgs();
        }

        public Builder(ConsumerArgs defaults) {
            $ = new ConsumerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param subnetwork The subnetwork of the customer project from which an IP address is reserved and used as the Dataproc Metastore service&#39;s endpoint. It is accessible to hosts in the subnet and to all hosts in a subnet in the same region and same network. There must be at least one IP address available in the subnet&#39;s primary range. The subnet is specified in the following form:`projects/{project_number}/regions/{region_id}/subnetworks/{subnetwork_id}
         * 
         * @return builder
         * 
         */
        public Builder subnetwork(@Nullable Output<String> subnetwork) {
            $.subnetwork = subnetwork;
            return this;
        }

        /**
         * @param subnetwork The subnetwork of the customer project from which an IP address is reserved and used as the Dataproc Metastore service&#39;s endpoint. It is accessible to hosts in the subnet and to all hosts in a subnet in the same region and same network. There must be at least one IP address available in the subnet&#39;s primary range. The subnet is specified in the following form:`projects/{project_number}/regions/{region_id}/subnetworks/{subnetwork_id}
         * 
         * @return builder
         * 
         */
        public Builder subnetwork(String subnetwork) {
            return subnetwork(Output.of(subnetwork));
        }

        public ConsumerArgs build() {
            return $;
        }
    }

}
