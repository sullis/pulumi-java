// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.azurenative.servicefabric.enums.ManagedIdentityType;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the managed identities for an Azure resource.
 * 
 */
public final class ManagedIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedIdentityArgs Empty = new ManagedIdentityArgs();

    /**
     * The type of managed identity for the resource.
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<ManagedIdentityType> type;

    public Input<ManagedIdentityType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    /**
     * The list of user identities associated with the resource. The user identity dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * 
     */
    @InputImport(name="userAssignedIdentities")
    private final @Nullable Input<Map<String,Object>> userAssignedIdentities;

    public Input<Map<String,Object>> getUserAssignedIdentities() {
        return this.userAssignedIdentities == null ? Input.empty() : this.userAssignedIdentities;
    }

    public ManagedIdentityArgs(
        @Nullable Input<ManagedIdentityType> type,
        @Nullable Input<Map<String,Object>> userAssignedIdentities) {
        this.type = type;
        this.userAssignedIdentities = userAssignedIdentities;
    }

    private ManagedIdentityArgs() {
        this.type = Input.empty();
        this.userAssignedIdentities = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ManagedIdentityType> type;
        private @Nullable Input<Map<String,Object>> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder setType(@Nullable Input<ManagedIdentityType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable ManagedIdentityType type) {
            this.type = Input.ofNullable(type);
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

        public ManagedIdentityArgs build() {
            return new ManagedIdentityArgs(type, userAssignedIdentities);
        }
    }
}
