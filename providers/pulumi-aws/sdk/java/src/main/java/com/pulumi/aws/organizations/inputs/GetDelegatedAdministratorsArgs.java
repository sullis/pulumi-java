// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDelegatedAdministratorsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDelegatedAdministratorsArgs Empty = new GetDelegatedAdministratorsArgs();

    /**
     * Specifies a service principal name. If specified, then the operation lists the delegated administrators only for the specified service. If you don&#39;t specify a service principal, the operation lists all delegated administrators for all services in your organization.
     * 
     */
    @Import(name="servicePrincipal")
    private @Nullable Output<String> servicePrincipal;

    /**
     * @return Specifies a service principal name. If specified, then the operation lists the delegated administrators only for the specified service. If you don&#39;t specify a service principal, the operation lists all delegated administrators for all services in your organization.
     * 
     */
    public Optional<Output<String>> servicePrincipal() {
        return Optional.ofNullable(this.servicePrincipal);
    }

    private GetDelegatedAdministratorsArgs() {}

    private GetDelegatedAdministratorsArgs(GetDelegatedAdministratorsArgs $) {
        this.servicePrincipal = $.servicePrincipal;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDelegatedAdministratorsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDelegatedAdministratorsArgs $;

        public Builder() {
            $ = new GetDelegatedAdministratorsArgs();
        }

        public Builder(GetDelegatedAdministratorsArgs defaults) {
            $ = new GetDelegatedAdministratorsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param servicePrincipal Specifies a service principal name. If specified, then the operation lists the delegated administrators only for the specified service. If you don&#39;t specify a service principal, the operation lists all delegated administrators for all services in your organization.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipal(@Nullable Output<String> servicePrincipal) {
            $.servicePrincipal = servicePrincipal;
            return this;
        }

        /**
         * @param servicePrincipal Specifies a service principal name. If specified, then the operation lists the delegated administrators only for the specified service. If you don&#39;t specify a service principal, the operation lists all delegated administrators for all services in your organization.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipal(String servicePrincipal) {
            return servicePrincipal(Output.of(servicePrincipal));
        }

        public GetDelegatedAdministratorsArgs build() {
            return $;
        }
    }

}
