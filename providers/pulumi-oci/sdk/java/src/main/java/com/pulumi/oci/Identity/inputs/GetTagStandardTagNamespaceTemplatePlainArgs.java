// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Identity.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTagStandardTagNamespaceTemplatePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTagStandardTagNamespaceTemplatePlainArgs Empty = new GetTagStandardTagNamespaceTemplatePlainArgs();

    /**
     * The OCID of the compartment (remember that the tenancy is simply the root compartment).
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The OCID of the compartment (remember that the tenancy is simply the root compartment).
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    /**
     * The name of the standard tag namespace tempate that is requested
     * 
     */
    @Import(name="standardTagNamespaceName", required=true)
    private String standardTagNamespaceName;

    /**
     * @return The name of the standard tag namespace tempate that is requested
     * 
     */
    public String standardTagNamespaceName() {
        return this.standardTagNamespaceName;
    }

    private GetTagStandardTagNamespaceTemplatePlainArgs() {}

    private GetTagStandardTagNamespaceTemplatePlainArgs(GetTagStandardTagNamespaceTemplatePlainArgs $) {
        this.compartmentId = $.compartmentId;
        this.standardTagNamespaceName = $.standardTagNamespaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTagStandardTagNamespaceTemplatePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTagStandardTagNamespaceTemplatePlainArgs $;

        public Builder() {
            $ = new GetTagStandardTagNamespaceTemplatePlainArgs();
        }

        public Builder(GetTagStandardTagNamespaceTemplatePlainArgs defaults) {
            $ = new GetTagStandardTagNamespaceTemplatePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The OCID of the compartment (remember that the tenancy is simply the root compartment).
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param standardTagNamespaceName The name of the standard tag namespace tempate that is requested
         * 
         * @return builder
         * 
         */
        public Builder standardTagNamespaceName(String standardTagNamespaceName) {
            $.standardTagNamespaceName = standardTagNamespaceName;
            return this;
        }

        public GetTagStandardTagNamespaceTemplatePlainArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            $.standardTagNamespaceName = Objects.requireNonNull($.standardTagNamespaceName, "expected parameter 'standardTagNamespaceName' to be non-null");
            return $;
        }
    }

}
