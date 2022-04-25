// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.enums.ResourceIdentityAssignment;
import com.pulumi.azurenative.machinelearningservices.inputs.UserAssignedIdentityMetaArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Service identity associated with a resource.
 * 
 */
public final class ResourceIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceIdentityArgs Empty = new ResourceIdentityArgs();

    /**
     * Defines values for a ResourceIdentity&#39;s type.
     * 
     */
    @Import(name="type")
    private @Nullable Output<Either<String,ResourceIdentityAssignment>> type;

    /**
     * @return Defines values for a ResourceIdentity&#39;s type.
     * 
     */
    public Optional<Output<Either<String,ResourceIdentityAssignment>>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Dictionary of the user assigned identities, key is ARM resource ID of the UAI.
     * 
     */
    @Import(name="userAssignedIdentities")
    private @Nullable Output<Map<String,UserAssignedIdentityMetaArgs>> userAssignedIdentities;

    /**
     * @return Dictionary of the user assigned identities, key is ARM resource ID of the UAI.
     * 
     */
    public Optional<Output<Map<String,UserAssignedIdentityMetaArgs>>> userAssignedIdentities() {
        return Optional.ofNullable(this.userAssignedIdentities);
    }

    private ResourceIdentityArgs() {}

    private ResourceIdentityArgs(ResourceIdentityArgs $) {
        this.type = $.type;
        this.userAssignedIdentities = $.userAssignedIdentities;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceIdentityArgs $;

        public Builder() {
            $ = new ResourceIdentityArgs();
        }

        public Builder(ResourceIdentityArgs defaults) {
            $ = new ResourceIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type Defines values for a ResourceIdentity&#39;s type.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<Either<String,ResourceIdentityAssignment>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Defines values for a ResourceIdentity&#39;s type.
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,ResourceIdentityAssignment> type) {
            return type(Output.of(type));
        }

        /**
         * @param type Defines values for a ResourceIdentity&#39;s type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        /**
         * @param type Defines values for a ResourceIdentity&#39;s type.
         * 
         * @return builder
         * 
         */
        public Builder type(ResourceIdentityAssignment type) {
            return type(Either.ofRight(type));
        }

        /**
         * @param userAssignedIdentities Dictionary of the user assigned identities, key is ARM resource ID of the UAI.
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentities(@Nullable Output<Map<String,UserAssignedIdentityMetaArgs>> userAssignedIdentities) {
            $.userAssignedIdentities = userAssignedIdentities;
            return this;
        }

        /**
         * @param userAssignedIdentities Dictionary of the user assigned identities, key is ARM resource ID of the UAI.
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentities(Map<String,UserAssignedIdentityMetaArgs> userAssignedIdentities) {
            return userAssignedIdentities(Output.of(userAssignedIdentities));
        }

        public ResourceIdentityArgs build() {
            return $;
        }
    }

}
