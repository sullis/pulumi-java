// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagepool;

import io.pulumi.azurenative.storagepool.inputs.TargetPortalGroupCreateArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IscsiTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final IscsiTargetArgs Empty = new IscsiTargetArgs();

    /**
     * The name of the Disk pool.
     * 
     */
    @InputImport(name="diskPoolName", required=true)
      private final Input<String> diskPoolName;

    public Input<String> getDiskPoolName() {
        return this.diskPoolName;
    }

    /**
     * The name of the iSCSI target.
     * 
     */
    @InputImport(name="iscsiTargetName")
      private final @Nullable Input<String> iscsiTargetName;

    public Input<String> getIscsiTargetName() {
        return this.iscsiTargetName == null ? Input.empty() : this.iscsiTargetName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * iSCSI target IQN (iSCSI Qualified Name); example: "iqn.2005-03.org.iscsi:server".
     * 
     */
    @InputImport(name="targetIqn")
      private final @Nullable Input<String> targetIqn;

    public Input<String> getTargetIqn() {
        return this.targetIqn == null ? Input.empty() : this.targetIqn;
    }

    /**
     * List of iSCSI target portal groups. Can have 1 portal group at most.
     * 
     */
    @InputImport(name="tpgs", required=true)
      private final Input<List<TargetPortalGroupCreateArgs>> tpgs;

    public Input<List<TargetPortalGroupCreateArgs>> getTpgs() {
        return this.tpgs;
    }

    public IscsiTargetArgs(
        Input<String> diskPoolName,
        @Nullable Input<String> iscsiTargetName,
        Input<String> resourceGroupName,
        @Nullable Input<String> targetIqn,
        Input<List<TargetPortalGroupCreateArgs>> tpgs) {
        this.diskPoolName = Objects.requireNonNull(diskPoolName, "expected parameter 'diskPoolName' to be non-null");
        this.iscsiTargetName = iscsiTargetName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.targetIqn = targetIqn;
        this.tpgs = Objects.requireNonNull(tpgs, "expected parameter 'tpgs' to be non-null");
    }

    private IscsiTargetArgs() {
        this.diskPoolName = Input.empty();
        this.iscsiTargetName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.targetIqn = Input.empty();
        this.tpgs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IscsiTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> diskPoolName;
        private @Nullable Input<String> iscsiTargetName;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> targetIqn;
        private Input<List<TargetPortalGroupCreateArgs>> tpgs;

        public Builder() {
    	      // Empty
        }

        public Builder(IscsiTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskPoolName = defaults.diskPoolName;
    	      this.iscsiTargetName = defaults.iscsiTargetName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.targetIqn = defaults.targetIqn;
    	      this.tpgs = defaults.tpgs;
        }

        public Builder setDiskPoolName(Input<String> diskPoolName) {
            this.diskPoolName = Objects.requireNonNull(diskPoolName);
            return this;
        }

        public Builder setDiskPoolName(String diskPoolName) {
            this.diskPoolName = Input.of(Objects.requireNonNull(diskPoolName));
            return this;
        }

        public Builder setIscsiTargetName(@Nullable Input<String> iscsiTargetName) {
            this.iscsiTargetName = iscsiTargetName;
            return this;
        }

        public Builder setIscsiTargetName(@Nullable String iscsiTargetName) {
            this.iscsiTargetName = Input.ofNullable(iscsiTargetName);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setTargetIqn(@Nullable Input<String> targetIqn) {
            this.targetIqn = targetIqn;
            return this;
        }

        public Builder setTargetIqn(@Nullable String targetIqn) {
            this.targetIqn = Input.ofNullable(targetIqn);
            return this;
        }

        public Builder setTpgs(Input<List<TargetPortalGroupCreateArgs>> tpgs) {
            this.tpgs = Objects.requireNonNull(tpgs);
            return this;
        }

        public Builder setTpgs(List<TargetPortalGroupCreateArgs> tpgs) {
            this.tpgs = Input.of(Objects.requireNonNull(tpgs));
            return this;
        }
        public IscsiTargetArgs build() {
            return new IscsiTargetArgs(diskPoolName, iscsiTargetName, resourceGroupName, targetIqn, tpgs);
        }
    }
}