// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.outputs;

import io.pulumi.awsnative.customerprofiles.outputs.ObjectTypeField;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ObjectTypeFieldMap {
    private final @Nullable String name;
    private final @Nullable ObjectTypeField objectTypeField;

    @OutputCustomType.Constructor({"name","objectTypeField"})
    private ObjectTypeFieldMap(
        @Nullable String name,
        @Nullable ObjectTypeField objectTypeField) {
        this.name = name;
        this.objectTypeField = objectTypeField;
    }

    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<ObjectTypeField> getObjectTypeField() {
        return Optional.ofNullable(this.objectTypeField);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectTypeFieldMap defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable ObjectTypeField objectTypeField;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectTypeFieldMap defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.objectTypeField = defaults.objectTypeField;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setObjectTypeField(@Nullable ObjectTypeField objectTypeField) {
            this.objectTypeField = objectTypeField;
            return this;
        }

        public ObjectTypeFieldMap build() {
            return new ObjectTypeFieldMap(name, objectTypeField);
        }
    }
}
