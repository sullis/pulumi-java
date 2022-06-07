// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.education.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGetLabArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGetLabArgs Empty = new GetGetLabArgs();

    /**
     * Billing account name.
     * 
     */
    @Import(name="billingAccountName", required=true)
    private Output<String> billingAccountName;

    /**
     * @return Billing account name.
     * 
     */
    public Output<String> billingAccountName() {
        return this.billingAccountName;
    }

    /**
     * Billing profile name.
     * 
     */
    @Import(name="billingProfileName", required=true)
    private Output<String> billingProfileName;

    /**
     * @return Billing profile name.
     * 
     */
    public Output<String> billingProfileName() {
        return this.billingProfileName;
    }

    /**
     * May be used to include budget information.
     * 
     */
    @Import(name="includeBudget")
    private @Nullable Output<Boolean> includeBudget;

    /**
     * @return May be used to include budget information.
     * 
     */
    public Optional<Output<Boolean>> includeBudget() {
        return Optional.ofNullable(this.includeBudget);
    }

    /**
     * Invoice section name.
     * 
     */
    @Import(name="invoiceSectionName", required=true)
    private Output<String> invoiceSectionName;

    /**
     * @return Invoice section name.
     * 
     */
    public Output<String> invoiceSectionName() {
        return this.invoiceSectionName;
    }

    private GetGetLabArgs() {}

    private GetGetLabArgs(GetGetLabArgs $) {
        this.billingAccountName = $.billingAccountName;
        this.billingProfileName = $.billingProfileName;
        this.includeBudget = $.includeBudget;
        this.invoiceSectionName = $.invoiceSectionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGetLabArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGetLabArgs $;

        public Builder() {
            $ = new GetGetLabArgs();
        }

        public Builder(GetGetLabArgs defaults) {
            $ = new GetGetLabArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param billingAccountName Billing account name.
         * 
         * @return builder
         * 
         */
        public Builder billingAccountName(Output<String> billingAccountName) {
            $.billingAccountName = billingAccountName;
            return this;
        }

        /**
         * @param billingAccountName Billing account name.
         * 
         * @return builder
         * 
         */
        public Builder billingAccountName(String billingAccountName) {
            return billingAccountName(Output.of(billingAccountName));
        }

        /**
         * @param billingProfileName Billing profile name.
         * 
         * @return builder
         * 
         */
        public Builder billingProfileName(Output<String> billingProfileName) {
            $.billingProfileName = billingProfileName;
            return this;
        }

        /**
         * @param billingProfileName Billing profile name.
         * 
         * @return builder
         * 
         */
        public Builder billingProfileName(String billingProfileName) {
            return billingProfileName(Output.of(billingProfileName));
        }

        /**
         * @param includeBudget May be used to include budget information.
         * 
         * @return builder
         * 
         */
        public Builder includeBudget(@Nullable Output<Boolean> includeBudget) {
            $.includeBudget = includeBudget;
            return this;
        }

        /**
         * @param includeBudget May be used to include budget information.
         * 
         * @return builder
         * 
         */
        public Builder includeBudget(Boolean includeBudget) {
            return includeBudget(Output.of(includeBudget));
        }

        /**
         * @param invoiceSectionName Invoice section name.
         * 
         * @return builder
         * 
         */
        public Builder invoiceSectionName(Output<String> invoiceSectionName) {
            $.invoiceSectionName = invoiceSectionName;
            return this;
        }

        /**
         * @param invoiceSectionName Invoice section name.
         * 
         * @return builder
         * 
         */
        public Builder invoiceSectionName(String invoiceSectionName) {
            return invoiceSectionName(Output.of(invoiceSectionName));
        }

        public GetGetLabArgs build() {
            $.billingAccountName = Objects.requireNonNull($.billingAccountName, "expected parameter 'billingAccountName' to be non-null");
            $.billingProfileName = Objects.requireNonNull($.billingProfileName, "expected parameter 'billingProfileName' to be non-null");
            $.invoiceSectionName = Objects.requireNonNull($.invoiceSectionName, "expected parameter 'invoiceSectionName' to be non-null");
            return $;
        }
    }

}
