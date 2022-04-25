// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * IsNotNull Advanced Filter.
 * 
 */
public final class IsNotNullAdvancedFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final IsNotNullAdvancedFilterArgs Empty = new IsNotNullAdvancedFilterArgs();

    /**
     * The field/property in the event based on which you want to filter.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return The field/property in the event based on which you want to filter.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     * Expected value is &#39;IsNotNull&#39;.
     * 
     */
    @Import(name="operatorType", required=true)
    private Output<String> operatorType;

    /**
     * @return The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     * Expected value is &#39;IsNotNull&#39;.
     * 
     */
    public Output<String> operatorType() {
        return this.operatorType;
    }

    private IsNotNullAdvancedFilterArgs() {}

    private IsNotNullAdvancedFilterArgs(IsNotNullAdvancedFilterArgs $) {
        this.key = $.key;
        this.operatorType = $.operatorType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IsNotNullAdvancedFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IsNotNullAdvancedFilterArgs $;

        public Builder() {
            $ = new IsNotNullAdvancedFilterArgs();
        }

        public Builder(IsNotNullAdvancedFilterArgs defaults) {
            $ = new IsNotNullAdvancedFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The field/property in the event based on which you want to filter.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The field/property in the event based on which you want to filter.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param operatorType The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
         * Expected value is &#39;IsNotNull&#39;.
         * 
         * @return builder
         * 
         */
        public Builder operatorType(Output<String> operatorType) {
            $.operatorType = operatorType;
            return this;
        }

        /**
         * @param operatorType The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
         * Expected value is &#39;IsNotNull&#39;.
         * 
         * @return builder
         * 
         */
        public Builder operatorType(String operatorType) {
            return operatorType(Output.of(operatorType));
        }

        public IsNotNullAdvancedFilterArgs build() {
            $.operatorType = Codegen.stringProp("operatorType").output().arg($.operatorType).require();
            return $;
        }
    }

}
