// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.inputs;

import io.pulumi.awsnative.backup.inputs.BackupSelectionConditionParameterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackupSelectionResourceTypeConditionsPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupSelectionResourceTypeConditionsPropertiesArgs Empty = new BackupSelectionResourceTypeConditionsPropertiesArgs();

    @InputImport(name="stringEquals")
    private final @Nullable Input<List<BackupSelectionConditionParameterArgs>> stringEquals;

    public Input<List<BackupSelectionConditionParameterArgs>> getStringEquals() {
        return this.stringEquals == null ? Input.empty() : this.stringEquals;
    }

    @InputImport(name="stringLike")
    private final @Nullable Input<List<BackupSelectionConditionParameterArgs>> stringLike;

    public Input<List<BackupSelectionConditionParameterArgs>> getStringLike() {
        return this.stringLike == null ? Input.empty() : this.stringLike;
    }

    @InputImport(name="stringNotEquals")
    private final @Nullable Input<List<BackupSelectionConditionParameterArgs>> stringNotEquals;

    public Input<List<BackupSelectionConditionParameterArgs>> getStringNotEquals() {
        return this.stringNotEquals == null ? Input.empty() : this.stringNotEquals;
    }

    @InputImport(name="stringNotLike")
    private final @Nullable Input<List<BackupSelectionConditionParameterArgs>> stringNotLike;

    public Input<List<BackupSelectionConditionParameterArgs>> getStringNotLike() {
        return this.stringNotLike == null ? Input.empty() : this.stringNotLike;
    }

    public BackupSelectionResourceTypeConditionsPropertiesArgs(
        @Nullable Input<List<BackupSelectionConditionParameterArgs>> stringEquals,
        @Nullable Input<List<BackupSelectionConditionParameterArgs>> stringLike,
        @Nullable Input<List<BackupSelectionConditionParameterArgs>> stringNotEquals,
        @Nullable Input<List<BackupSelectionConditionParameterArgs>> stringNotLike) {
        this.stringEquals = stringEquals;
        this.stringLike = stringLike;
        this.stringNotEquals = stringNotEquals;
        this.stringNotLike = stringNotLike;
    }

    private BackupSelectionResourceTypeConditionsPropertiesArgs() {
        this.stringEquals = Input.empty();
        this.stringLike = Input.empty();
        this.stringNotEquals = Input.empty();
        this.stringNotLike = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupSelectionResourceTypeConditionsPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<BackupSelectionConditionParameterArgs>> stringEquals;
        private @Nullable Input<List<BackupSelectionConditionParameterArgs>> stringLike;
        private @Nullable Input<List<BackupSelectionConditionParameterArgs>> stringNotEquals;
        private @Nullable Input<List<BackupSelectionConditionParameterArgs>> stringNotLike;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupSelectionResourceTypeConditionsPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.stringEquals = defaults.stringEquals;
    	      this.stringLike = defaults.stringLike;
    	      this.stringNotEquals = defaults.stringNotEquals;
    	      this.stringNotLike = defaults.stringNotLike;
        }

        public Builder setStringEquals(@Nullable Input<List<BackupSelectionConditionParameterArgs>> stringEquals) {
            this.stringEquals = stringEquals;
            return this;
        }

        public Builder setStringEquals(@Nullable List<BackupSelectionConditionParameterArgs> stringEquals) {
            this.stringEquals = Input.ofNullable(stringEquals);
            return this;
        }

        public Builder setStringLike(@Nullable Input<List<BackupSelectionConditionParameterArgs>> stringLike) {
            this.stringLike = stringLike;
            return this;
        }

        public Builder setStringLike(@Nullable List<BackupSelectionConditionParameterArgs> stringLike) {
            this.stringLike = Input.ofNullable(stringLike);
            return this;
        }

        public Builder setStringNotEquals(@Nullable Input<List<BackupSelectionConditionParameterArgs>> stringNotEquals) {
            this.stringNotEquals = stringNotEquals;
            return this;
        }

        public Builder setStringNotEquals(@Nullable List<BackupSelectionConditionParameterArgs> stringNotEquals) {
            this.stringNotEquals = Input.ofNullable(stringNotEquals);
            return this;
        }

        public Builder setStringNotLike(@Nullable Input<List<BackupSelectionConditionParameterArgs>> stringNotLike) {
            this.stringNotLike = stringNotLike;
            return this;
        }

        public Builder setStringNotLike(@Nullable List<BackupSelectionConditionParameterArgs> stringNotLike) {
            this.stringNotLike = Input.ofNullable(stringNotLike);
            return this;
        }

        public BackupSelectionResourceTypeConditionsPropertiesArgs build() {
            return new BackupSelectionResourceTypeConditionsPropertiesArgs(stringEquals, stringLike, stringNotEquals, stringNotLike);
        }
    }
}
