// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWebAppDomainOwnershipIdentifierSlotArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWebAppDomainOwnershipIdentifierSlotArgs Empty = new GetWebAppDomainOwnershipIdentifierSlotArgs();

    /**
     * Name of domain ownership identifier.
     * 
     */
    @Import(name="domainOwnershipIdentifierName", required=true)
    private Output<String> domainOwnershipIdentifierName;

    /**
     * @return Name of domain ownership identifier.
     * 
     */
    public Output<String> domainOwnershipIdentifierName() {
        return this.domainOwnershipIdentifierName;
    }

    /**
     * Name of the app.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the app.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the resource group to which the resource belongs.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the deployment slot. If a slot is not specified, the API will delete the binding for the production slot.
     * 
     */
    @Import(name="slot", required=true)
    private Output<String> slot;

    /**
     * @return Name of the deployment slot. If a slot is not specified, the API will delete the binding for the production slot.
     * 
     */
    public Output<String> slot() {
        return this.slot;
    }

    private GetWebAppDomainOwnershipIdentifierSlotArgs() {}

    private GetWebAppDomainOwnershipIdentifierSlotArgs(GetWebAppDomainOwnershipIdentifierSlotArgs $) {
        this.domainOwnershipIdentifierName = $.domainOwnershipIdentifierName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.slot = $.slot;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWebAppDomainOwnershipIdentifierSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWebAppDomainOwnershipIdentifierSlotArgs $;

        public Builder() {
            $ = new GetWebAppDomainOwnershipIdentifierSlotArgs();
        }

        public Builder(GetWebAppDomainOwnershipIdentifierSlotArgs defaults) {
            $ = new GetWebAppDomainOwnershipIdentifierSlotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domainOwnershipIdentifierName Name of domain ownership identifier.
         * 
         * @return builder
         * 
         */
        public Builder domainOwnershipIdentifierName(Output<String> domainOwnershipIdentifierName) {
            $.domainOwnershipIdentifierName = domainOwnershipIdentifierName;
            return this;
        }

        /**
         * @param domainOwnershipIdentifierName Name of domain ownership identifier.
         * 
         * @return builder
         * 
         */
        public Builder domainOwnershipIdentifierName(String domainOwnershipIdentifierName) {
            return domainOwnershipIdentifierName(Output.of(domainOwnershipIdentifierName));
        }

        /**
         * @param name Name of the app.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the app.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param slot Name of the deployment slot. If a slot is not specified, the API will delete the binding for the production slot.
         * 
         * @return builder
         * 
         */
        public Builder slot(Output<String> slot) {
            $.slot = slot;
            return this;
        }

        /**
         * @param slot Name of the deployment slot. If a slot is not specified, the API will delete the binding for the production slot.
         * 
         * @return builder
         * 
         */
        public Builder slot(String slot) {
            return slot(Output.of(slot));
        }

        public GetWebAppDomainOwnershipIdentifierSlotArgs build() {
            $.domainOwnershipIdentifierName = Objects.requireNonNull($.domainOwnershipIdentifierName, "expected parameter 'domainOwnershipIdentifierName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.slot = Objects.requireNonNull($.slot, "expected parameter 'slot' to be non-null");
            return $;
        }
    }

}
