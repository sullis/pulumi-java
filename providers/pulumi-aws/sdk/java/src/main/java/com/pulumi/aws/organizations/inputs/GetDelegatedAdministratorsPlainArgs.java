// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.organizations.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDelegatedAdministratorsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDelegatedAdministratorsPlainArgs Empty = new GetDelegatedAdministratorsPlainArgs();

    /**
     * Specifies a service principal name. If specified, then the operation lists the delegated administrators only for the specified service. If you don&#39;t specify a service principal, the operation lists all delegated administrators for all services in your organization.
     * 
     */
    @Import(name="servicePrincipal")
    private @Nullable String servicePrincipal;

    /**
     * @return Specifies a service principal name. If specified, then the operation lists the delegated administrators only for the specified service. If you don&#39;t specify a service principal, the operation lists all delegated administrators for all services in your organization.
     * 
     */
    public Optional<String> servicePrincipal() {
        return Optional.ofNullable(this.servicePrincipal);
    }

    private GetDelegatedAdministratorsPlainArgs() {}

    private GetDelegatedAdministratorsPlainArgs(GetDelegatedAdministratorsPlainArgs $) {
        this.servicePrincipal = $.servicePrincipal;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDelegatedAdministratorsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDelegatedAdministratorsPlainArgs $;

        public Builder() {
            $ = new GetDelegatedAdministratorsPlainArgs();
        }

        public Builder(GetDelegatedAdministratorsPlainArgs defaults) {
            $ = new GetDelegatedAdministratorsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param servicePrincipal Specifies a service principal name. If specified, then the operation lists the delegated administrators only for the specified service. If you don&#39;t specify a service principal, the operation lists all delegated administrators for all services in your organization.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipal(@Nullable String servicePrincipal) {
            $.servicePrincipal = servicePrincipal;
            return this;
        }

        public GetDelegatedAdministratorsPlainArgs build() {
            return $;
        }
    }

}
