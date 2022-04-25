// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.azurenative.storage.enums.ExpirationAction;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * SasPolicy assigned to the storage account.
 * 
 */
public final class SasPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final SasPolicyArgs Empty = new SasPolicyArgs();

    /**
     * The SAS expiration action. Can only be Log.
     * 
     */
    @Import(name="expirationAction", required=true)
    private Output<Either<String,ExpirationAction>> expirationAction;

    /**
     * @return The SAS expiration action. Can only be Log.
     * 
     */
    public Output<Either<String,ExpirationAction>> expirationAction() {
        return this.expirationAction;
    }

    /**
     * The SAS expiration period, DD.HH:MM:SS.
     * 
     */
    @Import(name="sasExpirationPeriod", required=true)
    private Output<String> sasExpirationPeriod;

    /**
     * @return The SAS expiration period, DD.HH:MM:SS.
     * 
     */
    public Output<String> sasExpirationPeriod() {
        return this.sasExpirationPeriod;
    }

    private SasPolicyArgs() {}

    private SasPolicyArgs(SasPolicyArgs $) {
        this.expirationAction = $.expirationAction;
        this.sasExpirationPeriod = $.sasExpirationPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SasPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SasPolicyArgs $;

        public Builder() {
            $ = new SasPolicyArgs();
        }

        public Builder(SasPolicyArgs defaults) {
            $ = new SasPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expirationAction The SAS expiration action. Can only be Log.
         * 
         * @return builder
         * 
         */
        public Builder expirationAction(Output<Either<String,ExpirationAction>> expirationAction) {
            $.expirationAction = expirationAction;
            return this;
        }

        /**
         * @param expirationAction The SAS expiration action. Can only be Log.
         * 
         * @return builder
         * 
         */
        public Builder expirationAction(Either<String,ExpirationAction> expirationAction) {
            return expirationAction(Output.of(expirationAction));
        }

        /**
         * @param expirationAction The SAS expiration action. Can only be Log.
         * 
         * @return builder
         * 
         */
        public Builder expirationAction(String expirationAction) {
            return expirationAction(Either.ofLeft(expirationAction));
        }

        /**
         * @param expirationAction The SAS expiration action. Can only be Log.
         * 
         * @return builder
         * 
         */
        public Builder expirationAction(ExpirationAction expirationAction) {
            return expirationAction(Either.ofRight(expirationAction));
        }

        /**
         * @param sasExpirationPeriod The SAS expiration period, DD.HH:MM:SS.
         * 
         * @return builder
         * 
         */
        public Builder sasExpirationPeriod(Output<String> sasExpirationPeriod) {
            $.sasExpirationPeriod = sasExpirationPeriod;
            return this;
        }

        /**
         * @param sasExpirationPeriod The SAS expiration period, DD.HH:MM:SS.
         * 
         * @return builder
         * 
         */
        public Builder sasExpirationPeriod(String sasExpirationPeriod) {
            return sasExpirationPeriod(Output.of(sasExpirationPeriod));
        }

        public SasPolicyArgs build() {
            $.expirationAction = Codegen.stringProp("expirationAction").left(ExpirationAction.class).output().arg($.expirationAction).def("Log").require();
            $.sasExpirationPeriod = Objects.requireNonNull($.sasExpirationPeriod, "expected parameter 'sasExpirationPeriod' to be non-null");
            return $;
        }
    }

}
