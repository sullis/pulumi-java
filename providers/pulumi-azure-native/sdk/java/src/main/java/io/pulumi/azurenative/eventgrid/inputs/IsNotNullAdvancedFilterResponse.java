// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * IsNotNull Advanced Filter.
 * 
 */
public final class IsNotNullAdvancedFilterResponse extends io.pulumi.resources.InvokeArgs {

    public static final IsNotNullAdvancedFilterResponse Empty = new IsNotNullAdvancedFilterResponse();

    /**
     * The field/property in the event based on which you want to filter.
     * 
     */
    @InputImport(name="key")
    private final @Nullable String key;

    public Optional<String> getKey() {
        return this.key == null ? Optional.empty() : Optional.ofNullable(this.key);
    }

    /**
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     * Expected value is 'IsNotNull'.
     * 
     */
    @InputImport(name="operatorType", required=true)
    private final String operatorType;

    public String getOperatorType() {
        return this.operatorType;
    }

    public IsNotNullAdvancedFilterResponse(
        @Nullable String key,
        String operatorType) {
        this.key = key;
        this.operatorType = Objects.requireNonNull(operatorType, "expected parameter 'operatorType' to be non-null");
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

        public Builder setKey(@Nullable String key) {
            this.key = key;
            return this;
        }

        public Builder setOperatorType(String operatorType) {
            this.operatorType = Objects.requireNonNull(operatorType);
            return this;
        }

        public IsNotNullAdvancedFilterResponse build() {
            return new IsNotNullAdvancedFilterResponse(key, operatorType);
        }
    }
}
