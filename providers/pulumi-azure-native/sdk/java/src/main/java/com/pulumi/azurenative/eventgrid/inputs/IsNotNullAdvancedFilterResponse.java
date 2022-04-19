// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

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
public final class IsNotNullAdvancedFilterResponse extends com.pulumi.resources.InvokeArgs {

    public static final IsNotNullAdvancedFilterResponse Empty = new IsNotNullAdvancedFilterResponse();

    /**
     * The field/property in the event based on which you want to filter.
     * 
     */
    @Import(name="key")
      private final @Nullable String key;

    public Optional<String> key() {
        return this.key == null ? Optional.empty() : Optional.ofNullable(this.key);
    }

    /**
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     * Expected value is 'IsNotNull'.
     * 
     */
    @Import(name="operatorType", required=true)
      private final String operatorType;

    public String operatorType() {
        return this.operatorType;
    }

    public IsNotNullAdvancedFilterResponse(
        @Nullable String key,
        String operatorType) {
        this.key = key;
        this.operatorType = Codegen.stringProp("operatorType").arg(operatorType).require();
    }

    private IsNotNullAdvancedFilterResponse() {
        this.key = null;
        this.operatorType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IsNotNullAdvancedFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String key;
        private String operatorType;

        public Builder() {
    	      // Empty
        }

        public Builder(IsNotNullAdvancedFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.operatorType = defaults.operatorType;
        }

        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        public Builder operatorType(String operatorType) {
            this.operatorType = Objects.requireNonNull(operatorType);
            return this;
        }        public IsNotNullAdvancedFilterResponse build() {
            return new IsNotNullAdvancedFilterResponse(key, operatorType);
        }
    }
}
