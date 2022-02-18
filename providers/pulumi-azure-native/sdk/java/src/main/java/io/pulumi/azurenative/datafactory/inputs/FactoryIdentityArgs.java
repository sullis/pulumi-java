// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.enums.FactoryIdentityType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Identity properties of the factory resource.
 * 
 */
public final class FactoryIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final FactoryIdentityArgs Empty = new FactoryIdentityArgs();

    /**
     * The identity type.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<Either<String,FactoryIdentityType>> type;

    public Input<Either<String,FactoryIdentityType>> getType() {
        return this.type;
    }

    /**
     * List of user assigned identities for the factory.
     * 
     */
    @InputImport(name="userAssignedIdentities")
    private final @Nullable Input<Map<String,Object>> userAssignedIdentities;

    public Input<Map<String,Object>> getUserAssignedIdentities() {
        return this.userAssignedIdentities == null ? Input.empty() : this.userAssignedIdentities;
    }

    public FactoryIdentityArgs(
        Input<Either<String,FactoryIdentityType>> type,
        @Nullable Input<Map<String,Object>> userAssignedIdentities) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userAssignedIdentities = userAssignedIdentities;
    }

    private FactoryIdentityArgs() {
        this.type = Input.empty();
        this.userAssignedIdentities = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FactoryIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,FactoryIdentityType>> type;
        private @Nullable Input<Map<String,Object>> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(FactoryIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder setType(Input<Either<String,FactoryIdentityType>> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(Either<String,FactoryIdentityType> type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setUserAssignedIdentities(@Nullable Input<Map<String,Object>> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }

        public Builder setUserAssignedIdentities(@Nullable Map<String,Object> userAssignedIdentities) {
            this.userAssignedIdentities = Input.ofNullable(userAssignedIdentities);
            return this;
        }

        public FactoryIdentityArgs build() {
            return new FactoryIdentityArgs(type, userAssignedIdentities);
        }
    }
}
