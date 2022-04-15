// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionProfileEncryptionEntitiesItemGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FieldLevelEncryptionProfileEncryptionEntitiesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FieldLevelEncryptionProfileEncryptionEntitiesGetArgs Empty = new FieldLevelEncryptionProfileEncryptionEntitiesGetArgs();

    @Import(name="items")
      private final @Nullable Output<List<FieldLevelEncryptionProfileEncryptionEntitiesItemGetArgs>> items;

    public Output<List<FieldLevelEncryptionProfileEncryptionEntitiesItemGetArgs>> items() {
        return this.items == null ? Codegen.empty() : this.items;
    }

    public FieldLevelEncryptionProfileEncryptionEntitiesGetArgs(@Nullable Output<List<FieldLevelEncryptionProfileEncryptionEntitiesItemGetArgs>> items) {
        this.items = items;
    }

    private FieldLevelEncryptionProfileEncryptionEntitiesGetArgs() {
        this.items = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FieldLevelEncryptionProfileEncryptionEntitiesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<FieldLevelEncryptionProfileEncryptionEntitiesItemGetArgs>> items;

        public Builder() {
    	      // Empty
        }

        public Builder(FieldLevelEncryptionProfileEncryptionEntitiesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(@Nullable Output<List<FieldLevelEncryptionProfileEncryptionEntitiesItemGetArgs>> items) {
            this.items = items;
            return this;
        }
        public Builder items(@Nullable List<FieldLevelEncryptionProfileEncryptionEntitiesItemGetArgs> items) {
            this.items = Codegen.ofNullable(items);
            return this;
        }
        public Builder items(FieldLevelEncryptionProfileEncryptionEntitiesItemGetArgs... items) {
            return items(List.of(items));
        }        public FieldLevelEncryptionProfileEncryptionEntitiesGetArgs build() {
            return new FieldLevelEncryptionProfileEncryptionEntitiesGetArgs(items);
        }
    }
}
