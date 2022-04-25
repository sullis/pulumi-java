// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A user that can be assigned to a compute instance.
 * 
 */
public final class AssignedUserResponse extends com.pulumi.resources.InvokeArgs {

    public static final AssignedUserResponse Empty = new AssignedUserResponse();

    /**
     * User’s AAD Object Id.
     * 
     */
    @Import(name="objectId", required=true)
    private String objectId;

    /**
     * @return User’s AAD Object Id.
     * 
     */
    public String objectId() {
        return this.objectId;
    }

    /**
     * User’s AAD Tenant Id.
     * 
     */
    @Import(name="tenantId", required=true)
    private String tenantId;

    /**
     * @return User’s AAD Tenant Id.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }

    private AssignedUserResponse() {}

    private AssignedUserResponse(AssignedUserResponse $) {
        this.objectId = $.objectId;
        this.tenantId = $.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AssignedUserResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssignedUserResponse $;

        public Builder() {
            $ = new AssignedUserResponse();
        }

        public Builder(AssignedUserResponse defaults) {
            $ = new AssignedUserResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param objectId User’s AAD Object Id.
         * 
         * @return builder
         * 
         */
        public Builder objectId(String objectId) {
            $.objectId = objectId;
            return this;
        }

        /**
         * @param tenantId User’s AAD Tenant Id.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        public AssignedUserResponse build() {
            $.objectId = Objects.requireNonNull($.objectId, "expected parameter 'objectId' to be non-null");
            $.tenantId = Objects.requireNonNull($.tenantId, "expected parameter 'tenantId' to be non-null");
            return $;
        }
    }

}
