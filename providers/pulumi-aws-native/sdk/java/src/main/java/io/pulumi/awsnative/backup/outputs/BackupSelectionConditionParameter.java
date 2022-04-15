// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BackupSelectionConditionParameter {
    private final @Nullable String conditionKey;
    private final @Nullable String conditionValue;

    @CustomType.Constructor
    private BackupSelectionConditionParameter(
        @CustomType.Parameter("conditionKey") @Nullable String conditionKey,
        @CustomType.Parameter("conditionValue") @Nullable String conditionValue) {
        this.conditionKey = conditionKey;
        this.conditionValue = conditionValue;
    }

    public Optional<String> conditionKey() {
        return Optional.ofNullable(this.conditionKey);
    }
    public Optional<String> conditionValue() {
        return Optional.ofNullable(this.conditionValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupSelectionConditionParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String conditionKey;
        private @Nullable String conditionValue;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupSelectionConditionParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditionKey = defaults.conditionKey;
    	      this.conditionValue = defaults.conditionValue;
        }

        public Builder conditionKey(@Nullable String conditionKey) {
            this.conditionKey = conditionKey;
            return this;
        }
        public Builder conditionValue(@Nullable String conditionValue) {
            this.conditionValue = conditionValue;
            return this;
        }        public BackupSelectionConditionParameter build() {
            return new BackupSelectionConditionParameter(conditionKey, conditionValue);
        }
    }
}
