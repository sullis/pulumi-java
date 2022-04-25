// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquerydatatransfer_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Information about a user.
 * 
 */
public final class UserInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final UserInfoResponse Empty = new UserInfoResponse();

    /**
     * E-mail address of the user.
     * 
     */
    @Import(name="email", required=true)
    private String email;

    /**
     * @return E-mail address of the user.
     * 
     */
    public String email() {
        return this.email;
    }

    private UserInfoResponse() {}

    private UserInfoResponse(UserInfoResponse $) {
        this.email = $.email;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserInfoResponse $;

        public Builder() {
            $ = new UserInfoResponse();
        }

        public Builder(UserInfoResponse defaults) {
            $ = new UserInfoResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param email E-mail address of the user.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            $.email = email;
            return this;
        }

        public UserInfoResponse build() {
            $.email = Objects.requireNonNull($.email, "expected parameter 'email' to be non-null");
            return $;
        }
    }

}
