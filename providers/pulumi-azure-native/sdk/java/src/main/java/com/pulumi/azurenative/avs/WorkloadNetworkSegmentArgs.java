// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs;

import com.pulumi.azurenative.avs.inputs.WorkloadNetworkSegmentSubnetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkloadNetworkSegmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkloadNetworkSegmentArgs Empty = new WorkloadNetworkSegmentArgs();

    /**
     * Gateway which to connect segment to.
     * 
     */
    @Import(name="connectedGateway")
    private @Nullable Output<String> connectedGateway;

    /**
     * @return Gateway which to connect segment to.
     * 
     */
    public Optional<Output<String>> connectedGateway() {
        return Optional.ofNullable(this.connectedGateway);
    }

    /**
     * Display name of the segment.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Display name of the segment.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Name of the private cloud
     * 
     */
    @Import(name="privateCloudName", required=true)
    private Output<String> privateCloudName;

    /**
     * @return Name of the private cloud
     * 
     */
    public Output<String> privateCloudName() {
        return this.privateCloudName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * NSX revision number.
     * 
     */
    @Import(name="revision")
    private @Nullable Output<Double> revision;

    /**
     * @return NSX revision number.
     * 
     */
    public Optional<Output<Double>> revision() {
        return Optional.ofNullable(this.revision);
    }

    /**
     * NSX Segment identifier. Generally the same as the Segment&#39;s display name
     * 
     */
    @Import(name="segmentId")
    private @Nullable Output<String> segmentId;

    /**
     * @return NSX Segment identifier. Generally the same as the Segment&#39;s display name
     * 
     */
    public Optional<Output<String>> segmentId() {
        return Optional.ofNullable(this.segmentId);
    }

    /**
     * Subnet which to connect segment to.
     * 
     */
    @Import(name="subnet")
    private @Nullable Output<WorkloadNetworkSegmentSubnetArgs> subnet;

    /**
     * @return Subnet which to connect segment to.
     * 
     */
    public Optional<Output<WorkloadNetworkSegmentSubnetArgs>> subnet() {
        return Optional.ofNullable(this.subnet);
    }

    private WorkloadNetworkSegmentArgs() {}

    private WorkloadNetworkSegmentArgs(WorkloadNetworkSegmentArgs $) {
        this.connectedGateway = $.connectedGateway;
        this.displayName = $.displayName;
        this.privateCloudName = $.privateCloudName;
        this.resourceGroupName = $.resourceGroupName;
        this.revision = $.revision;
        this.segmentId = $.segmentId;
        this.subnet = $.subnet;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkloadNetworkSegmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkloadNetworkSegmentArgs $;

        public Builder() {
            $ = new WorkloadNetworkSegmentArgs();
        }

        public Builder(WorkloadNetworkSegmentArgs defaults) {
            $ = new WorkloadNetworkSegmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectedGateway Gateway which to connect segment to.
         * 
         * @return builder
         * 
         */
        public Builder connectedGateway(@Nullable Output<String> connectedGateway) {
            $.connectedGateway = connectedGateway;
            return this;
        }

        /**
         * @param connectedGateway Gateway which to connect segment to.
         * 
         * @return builder
         * 
         */
        public Builder connectedGateway(String connectedGateway) {
            return connectedGateway(Output.of(connectedGateway));
        }

        /**
         * @param displayName Display name of the segment.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Display name of the segment.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param privateCloudName Name of the private cloud
         * 
         * @return builder
         * 
         */
        public Builder privateCloudName(Output<String> privateCloudName) {
            $.privateCloudName = privateCloudName;
            return this;
        }

        /**
         * @param privateCloudName Name of the private cloud
         * 
         * @return builder
         * 
         */
        public Builder privateCloudName(String privateCloudName) {
            return privateCloudName(Output.of(privateCloudName));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param revision NSX revision number.
         * 
         * @return builder
         * 
         */
        public Builder revision(@Nullable Output<Double> revision) {
            $.revision = revision;
            return this;
        }

        /**
         * @param revision NSX revision number.
         * 
         * @return builder
         * 
         */
        public Builder revision(Double revision) {
            return revision(Output.of(revision));
        }

        /**
         * @param segmentId NSX Segment identifier. Generally the same as the Segment&#39;s display name
         * 
         * @return builder
         * 
         */
        public Builder segmentId(@Nullable Output<String> segmentId) {
            $.segmentId = segmentId;
            return this;
        }

        /**
         * @param segmentId NSX Segment identifier. Generally the same as the Segment&#39;s display name
         * 
         * @return builder
         * 
         */
        public Builder segmentId(String segmentId) {
            return segmentId(Output.of(segmentId));
        }

        /**
         * @param subnet Subnet which to connect segment to.
         * 
         * @return builder
         * 
         */
        public Builder subnet(@Nullable Output<WorkloadNetworkSegmentSubnetArgs> subnet) {
            $.subnet = subnet;
            return this;
        }

        /**
         * @param subnet Subnet which to connect segment to.
         * 
         * @return builder
         * 
         */
        public Builder subnet(WorkloadNetworkSegmentSubnetArgs subnet) {
            return subnet(Output.of(subnet));
        }

        public WorkloadNetworkSegmentArgs build() {
            $.privateCloudName = Objects.requireNonNull($.privateCloudName, "expected parameter 'privateCloudName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
