// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterClusterConfigMasterConfigDiskConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterClusterConfigMasterConfigDiskConfigGetArgs Empty = new ClusterClusterConfigMasterConfigDiskConfigGetArgs();

    /**
     * Size of the primary disk attached to each preemptible worker node, specified
     * in GB. The smallest allowed disk size is 10GB. GCP will default to a predetermined
     * computed value if not set (currently 500GB). Note: If SSDs are not
     * attached, it also contains the HDFS data blocks and Hadoop working directories.
     * 
     */
    @Import(name="bootDiskSizeGb")
    private @Nullable Output<Integer> bootDiskSizeGb;

    /**
     * @return Size of the primary disk attached to each preemptible worker node, specified
     * in GB. The smallest allowed disk size is 10GB. GCP will default to a predetermined
     * computed value if not set (currently 500GB). Note: If SSDs are not
     * attached, it also contains the HDFS data blocks and Hadoop working directories.
     * 
     */
    public Optional<Output<Integer>> bootDiskSizeGb() {
        return Optional.ofNullable(this.bootDiskSizeGb);
    }

    /**
     * The disk type of the primary disk attached to each preemptible worker node.
     * One of `&#34;pd-ssd&#34;` or `&#34;pd-standard&#34;`. Defaults to `&#34;pd-standard&#34;`.
     * 
     */
    @Import(name="bootDiskType")
    private @Nullable Output<String> bootDiskType;

    /**
     * @return The disk type of the primary disk attached to each preemptible worker node.
     * One of `&#34;pd-ssd&#34;` or `&#34;pd-standard&#34;`. Defaults to `&#34;pd-standard&#34;`.
     * 
     */
    public Optional<Output<String>> bootDiskType() {
        return Optional.ofNullable(this.bootDiskType);
    }

    /**
     * The amount of local SSD disks that will be
     * attached to each preemptible worker node. Defaults to 0.
     * 
     */
    @Import(name="numLocalSsds")
    private @Nullable Output<Integer> numLocalSsds;

    /**
     * @return The amount of local SSD disks that will be
     * attached to each preemptible worker node. Defaults to 0.
     * 
     */
    public Optional<Output<Integer>> numLocalSsds() {
        return Optional.ofNullable(this.numLocalSsds);
    }

    private ClusterClusterConfigMasterConfigDiskConfigGetArgs() {}

    private ClusterClusterConfigMasterConfigDiskConfigGetArgs(ClusterClusterConfigMasterConfigDiskConfigGetArgs $) {
        this.bootDiskSizeGb = $.bootDiskSizeGb;
        this.bootDiskType = $.bootDiskType;
        this.numLocalSsds = $.numLocalSsds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterClusterConfigMasterConfigDiskConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterClusterConfigMasterConfigDiskConfigGetArgs $;

        public Builder() {
            $ = new ClusterClusterConfigMasterConfigDiskConfigGetArgs();
        }

        public Builder(ClusterClusterConfigMasterConfigDiskConfigGetArgs defaults) {
            $ = new ClusterClusterConfigMasterConfigDiskConfigGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bootDiskSizeGb Size of the primary disk attached to each preemptible worker node, specified
         * in GB. The smallest allowed disk size is 10GB. GCP will default to a predetermined
         * computed value if not set (currently 500GB). Note: If SSDs are not
         * attached, it also contains the HDFS data blocks and Hadoop working directories.
         * 
         * @return builder
         * 
         */
        public Builder bootDiskSizeGb(@Nullable Output<Integer> bootDiskSizeGb) {
            $.bootDiskSizeGb = bootDiskSizeGb;
            return this;
        }

        /**
         * @param bootDiskSizeGb Size of the primary disk attached to each preemptible worker node, specified
         * in GB. The smallest allowed disk size is 10GB. GCP will default to a predetermined
         * computed value if not set (currently 500GB). Note: If SSDs are not
         * attached, it also contains the HDFS data blocks and Hadoop working directories.
         * 
         * @return builder
         * 
         */
        public Builder bootDiskSizeGb(Integer bootDiskSizeGb) {
            return bootDiskSizeGb(Output.of(bootDiskSizeGb));
        }

        /**
         * @param bootDiskType The disk type of the primary disk attached to each preemptible worker node.
         * One of `&#34;pd-ssd&#34;` or `&#34;pd-standard&#34;`. Defaults to `&#34;pd-standard&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder bootDiskType(@Nullable Output<String> bootDiskType) {
            $.bootDiskType = bootDiskType;
            return this;
        }

        /**
         * @param bootDiskType The disk type of the primary disk attached to each preemptible worker node.
         * One of `&#34;pd-ssd&#34;` or `&#34;pd-standard&#34;`. Defaults to `&#34;pd-standard&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder bootDiskType(String bootDiskType) {
            return bootDiskType(Output.of(bootDiskType));
        }

        /**
         * @param numLocalSsds The amount of local SSD disks that will be
         * attached to each preemptible worker node. Defaults to 0.
         * 
         * @return builder
         * 
         */
        public Builder numLocalSsds(@Nullable Output<Integer> numLocalSsds) {
            $.numLocalSsds = numLocalSsds;
            return this;
        }

        /**
         * @param numLocalSsds The amount of local SSD disks that will be
         * attached to each preemptible worker node. Defaults to 0.
         * 
         * @return builder
         * 
         */
        public Builder numLocalSsds(Integer numLocalSsds) {
            return numLocalSsds(Output.of(numLocalSsds));
        }

        public ClusterClusterConfigMasterConfigDiskConfigGetArgs build() {
            return $;
        }
    }

}
