// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.azurenative.devtestlab.enums.UsagePermissionType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Subnet information.
 * 
 */
public final class SubnetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubnetArgs Empty = new SubnetArgs();

    /**
     * The permission policy of the subnet for allowing public IP addresses (i.e. Allow, Deny)).
     * 
     */
    @InputImport(name="allowPublicIp")
    private final @Nullable Input<Either<String,UsagePermissionType>> allowPublicIp;

    public Input<Either<String,UsagePermissionType>> getAllowPublicIp() {
        return this.allowPublicIp == null ? Input.empty() : this.allowPublicIp;
    }

    /**
     * The name of the subnet as seen in the lab.
     * 
     */
    @InputImport(name="labSubnetName")
    private final @Nullable Input<String> labSubnetName;

    public Input<String> getLabSubnetName() {
        return this.labSubnetName == null ? Input.empty() : this.labSubnetName;
    }

    /**
     * The resource ID of the subnet.
     * 
     */
    @InputImport(name="resourceId")
    private final @Nullable Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId == null ? Input.empty() : this.resourceId;
    }

    public SubnetArgs(
        @Nullable Input<Either<String,UsagePermissionType>> allowPublicIp,
        @Nullable Input<String> labSubnetName,
        @Nullable Input<String> resourceId) {
        this.allowPublicIp = allowPublicIp;
        this.labSubnetName = labSubnetName;
        this.resourceId = resourceId;
    }

    private SubnetArgs() {
        this.allowPublicIp = Input.empty();
        this.labSubnetName = Input.empty();
        this.resourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,UsagePermissionType>> allowPublicIp;
        private @Nullable Input<String> labSubnetName;
        private @Nullable Input<String> resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowPublicIp = defaults.allowPublicIp;
    	      this.labSubnetName = defaults.labSubnetName;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder setAllowPublicIp(@Nullable Input<Either<String,UsagePermissionType>> allowPublicIp) {
            this.allowPublicIp = allowPublicIp;
            return this;
        }

        public Builder setAllowPublicIp(@Nullable Either<String,UsagePermissionType> allowPublicIp) {
            this.allowPublicIp = Input.ofNullable(allowPublicIp);
            return this;
        }

        public Builder setLabSubnetName(@Nullable Input<String> labSubnetName) {
            this.labSubnetName = labSubnetName;
            return this;
        }

        public Builder setLabSubnetName(@Nullable String labSubnetName) {
            this.labSubnetName = Input.ofNullable(labSubnetName);
            return this;
        }

        public Builder setResourceId(@Nullable Input<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = Input.ofNullable(resourceId);
            return this;
        }

        public SubnetArgs build() {
            return new SubnetArgs(allowPublicIp, labSubnetName, resourceId);
        }
    }
}
