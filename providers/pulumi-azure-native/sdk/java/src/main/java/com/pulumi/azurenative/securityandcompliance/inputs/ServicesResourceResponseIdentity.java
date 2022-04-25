// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityandcompliance.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Setting indicating whether the service has a managed identity associated with it.
 * 
 */
public final class ServicesResourceResponseIdentity extends com.pulumi.resources.InvokeArgs {

    public static final ServicesResourceResponseIdentity Empty = new ServicesResourceResponseIdentity();

    /**
     * The principal ID of the resource identity.
     * 
     */
    @Import(name="principalId", required=true)
    private String principalId;

    /**
     * @return The principal ID of the resource identity.
     * 
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * The tenant ID of the resource.
     * 
     */
    @Import(name="tenantId", required=true)
    private String tenantId;

    /**
     * @return The tenant ID of the resource.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Type of identity being specified, currently SystemAssigned and None are allowed.
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    /**
     * @return Type of identity being specified, currently SystemAssigned and None are allowed.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private ServicesResourceResponseIdentity() {}

    private ServicesResourceResponseIdentity(ServicesResourceResponseIdentity $) {
        this.principalId = $.principalId;
        this.tenantId = $.tenantId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicesResourceResponseIdentity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicesResourceResponseIdentity $;

        public Builder() {
            $ = new ServicesResourceResponseIdentity();
        }

        public Builder(ServicesResourceResponseIdentity defaults) {
            $ = new ServicesResourceResponseIdentity(Objects.requireNonNull(defaults));
        }

        /**
         * @param principalId The principal ID of the resource identity.
         * 
         * @return builder
         * 
         */
        public Builder principalId(String principalId) {
            $.principalId = principalId;
            return this;
        }

        /**
         * @param tenantId The tenant ID of the resource.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param type Type of identity being specified, currently SystemAssigned and None are allowed.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public ServicesResourceResponseIdentity build() {
            $.principalId = Objects.requireNonNull($.principalId, "expected parameter 'principalId' to be non-null");
            $.tenantId = Objects.requireNonNull($.tenantId, "expected parameter 'tenantId' to be non-null");
            return $;
        }
    }

}
