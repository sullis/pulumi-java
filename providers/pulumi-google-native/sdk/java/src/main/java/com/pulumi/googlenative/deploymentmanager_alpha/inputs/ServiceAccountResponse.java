// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Service Account used as a credential.
 * 
 */
public final class ServiceAccountResponse extends com.pulumi.resources.InvokeArgs {

    public static final ServiceAccountResponse Empty = new ServiceAccountResponse();

    /**
     * The IAM service account email address like test@myproject.iam.gserviceaccount.com
     * 
     */
    @Import(name="email", required=true)
    private String email;

    /**
     * @return The IAM service account email address like test@myproject.iam.gserviceaccount.com
     * 
     */
    public String email() {
        return this.email;
    }

    private ServiceAccountResponse() {}

    private ServiceAccountResponse(ServiceAccountResponse $) {
        this.email = $.email;
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
         * @param email The IAM service account email address like test@myproject.iam.gserviceaccount.com
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            $.email = email;
            return this;
        }

        public ServiceAccountResponse build() {
            $.email = Objects.requireNonNull($.email, "expected parameter 'email' to be non-null");
            return $;
        }
    }

}
