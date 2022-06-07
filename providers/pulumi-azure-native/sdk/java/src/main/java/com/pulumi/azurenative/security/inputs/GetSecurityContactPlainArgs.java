// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSecurityContactPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSecurityContactPlainArgs Empty = new GetSecurityContactPlainArgs();

    /**
     * Name of the security contact object
     * 
     */
    @Import(name="securityContactName", required=true)
    private String securityContactName;

    /**
     * @return Name of the security contact object
     * 
     */
    public String securityContactName() {
        return this.securityContactName;
    }

    private GetSecurityContactPlainArgs() {}

    private GetSecurityContactPlainArgs(GetSecurityContactPlainArgs $) {
        this.securityContactName = $.securityContactName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecurityContactPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecurityContactPlainArgs $;

        public Builder() {
            $ = new GetSecurityContactPlainArgs();
        }

        public Builder(GetSecurityContactPlainArgs defaults) {
            $ = new GetSecurityContactPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param securityContactName Name of the security contact object
         * 
         * @return builder
         * 
         */
        public Builder securityContactName(String securityContactName) {
            $.securityContactName = securityContactName;
            return this;
        }

        public GetSecurityContactPlainArgs build() {
            $.securityContactName = Objects.requireNonNull($.securityContactName, "expected parameter 'securityContactName' to be non-null");
            return $;
        }
    }

}
