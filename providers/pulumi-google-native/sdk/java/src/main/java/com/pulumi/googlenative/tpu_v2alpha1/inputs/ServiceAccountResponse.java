// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.tpu_v2alpha1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A service account.
 * 
 */
public final class ServiceAccountResponse extends com.pulumi.resources.InvokeArgs {

    public static final ServiceAccountResponse Empty = new ServiceAccountResponse();

    /**
     * Email address of the service account. If empty, default Compute service account will be used.
     * 
     */
    @Import(name="email", required=true)
    private String email;

    /**
     * @return Email address of the service account. If empty, default Compute service account will be used.
     * 
     */
    public String email() {
        return this.email;
    }

    /**
     * The list of scopes to be made available for this service account. If empty, access to all Cloud APIs will be allowed.
     * 
     */
    @Import(name="scope", required=true)
    private List<String> scope;

    /**
     * @return The list of scopes to be made available for this service account. If empty, access to all Cloud APIs will be allowed.
     * 
     */
    public List<String> scope() {
        return this.scope;
    }

    private ServiceAccountResponse() {}

    private ServiceAccountResponse(ServiceAccountResponse $) {
        this.email = $.email;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceAccountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceAccountResponse $;

        public Builder() {
            $ = new ServiceAccountResponse();
        }

        public Builder(ServiceAccountResponse defaults) {
            $ = new ServiceAccountResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param email Email address of the service account. If empty, default Compute service account will be used.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            $.email = email;
            return this;
        }

        /**
         * @param scope The list of scopes to be made available for this service account. If empty, access to all Cloud APIs will be allowed.
         * 
         * @return builder
         * 
         */
        public Builder scope(List<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The list of scopes to be made available for this service account. If empty, access to all Cloud APIs will be allowed.
         * 
         * @return builder
         * 
         */
        public Builder scope(String... scope) {
            return scope(List.of(scope));
        }

        public ServiceAccountResponse build() {
            $.email = Objects.requireNonNull($.email, "expected parameter 'email' to be non-null");
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}
