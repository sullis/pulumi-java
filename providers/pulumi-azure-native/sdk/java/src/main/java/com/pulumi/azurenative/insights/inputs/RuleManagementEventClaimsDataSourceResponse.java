// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The claims for a rule management event data source.
 * 
 */
public final class RuleManagementEventClaimsDataSourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final RuleManagementEventClaimsDataSourceResponse Empty = new RuleManagementEventClaimsDataSourceResponse();

    /**
     * the email address.
     * 
     */
    @Import(name="emailAddress")
    private @Nullable String emailAddress;

    /**
     * @return the email address.
     * 
     */
    public Optional<String> emailAddress() {
        return Optional.ofNullable(this.emailAddress);
    }

    private RuleManagementEventClaimsDataSourceResponse() {}

    private RuleManagementEventClaimsDataSourceResponse(RuleManagementEventClaimsDataSourceResponse $) {
        this.emailAddress = $.emailAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleManagementEventClaimsDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleManagementEventClaimsDataSourceResponse $;

        public Builder() {
            $ = new RuleManagementEventClaimsDataSourceResponse();
        }

        public Builder(RuleManagementEventClaimsDataSourceResponse defaults) {
            $ = new RuleManagementEventClaimsDataSourceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param emailAddress the email address.
         * 
         * @return builder
         * 
         */
        public Builder emailAddress(@Nullable String emailAddress) {
            $.emailAddress = emailAddress;
            return this;
        }

        public RuleManagementEventClaimsDataSourceResponse build() {
            return $;
        }
    }

}
