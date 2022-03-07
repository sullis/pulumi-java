// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningcompute.inputs;

import io.pulumi.azurenative.machinelearningcompute.enums.SystemServiceType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Information about a system service deployed in the cluster
 * 
 */
public final class SystemServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SystemServiceArgs Empty = new SystemServiceArgs();

    /**
     * The system service type
     * 
     */
    @InputImport(name="systemServiceType", required=true)
      private final Input<Either<String,SystemServiceType>> systemServiceType;

    public Input<Either<String,SystemServiceType>> getSystemServiceType() {
        return this.systemServiceType;
    }

    public SystemServiceArgs(Input<Either<String,SystemServiceType>> systemServiceType) {
        this.systemServiceType = Objects.requireNonNull(systemServiceType, "expected parameter 'systemServiceType' to be non-null");
    }

    private SystemServiceArgs() {
        this.systemServiceType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SystemServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,SystemServiceType>> systemServiceType;

        public Builder() {
    	      // Empty
        }

        public Builder(SystemServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.systemServiceType = defaults.systemServiceType;
        }

        public Builder setSystemServiceType(Input<Either<String,SystemServiceType>> systemServiceType) {
            this.systemServiceType = Objects.requireNonNull(systemServiceType);
            return this;
        }

        public Builder setSystemServiceType(Either<String,SystemServiceType> systemServiceType) {
            this.systemServiceType = Input.of(Objects.requireNonNull(systemServiceType));
            return this;
        }
        public SystemServiceArgs build() {
            return new SystemServiceArgs(systemServiceType);
        }
    }
}