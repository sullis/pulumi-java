// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Msi identity details of the resource
 * 
 */
public final class ResourceIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceIdentityArgs Empty = new ResourceIdentityArgs();

    /**
     * Identity type
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Identity type
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * User Assigned Identities
     * 
     */
    @Import(name="userAssignedIdentities")
    private @Nullable Output<Map<String,Object>> userAssignedIdentities;

    /**
     * @return User Assigned Identities
     * 
     */
    public Optional<Output<Map<String,Object>>> userAssignedIdentities() {
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
         * @param type Identity type
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Identity type
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param userAssignedIdentities User Assigned Identities
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentities(@Nullable Output<Map<String,Object>> userAssignedIdentities) {
            $.userAssignedIdentities = userAssignedIdentities;
            return this;
        }

        /**
         * @param userAssignedIdentities User Assigned Identities
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentities(Map<String,Object> userAssignedIdentities) {
            return userAssignedIdentities(Output.of(userAssignedIdentities));
        }

        public ResourceIdentityArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).def("None").getNullable();
            return $;
        }
    }

}
