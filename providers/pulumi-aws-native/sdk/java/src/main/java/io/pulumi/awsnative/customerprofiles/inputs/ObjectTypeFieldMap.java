// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.inputs;

import io.pulumi.awsnative.customerprofiles.inputs.ObjectTypeField;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ObjectTypeFieldMap extends io.pulumi.resources.InvokeArgs {

    public static final ObjectTypeFieldMap Empty = new ObjectTypeFieldMap();

    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    @Import(name="objectTypeField")
      private final @Nullable ObjectTypeField objectTypeField;

    public Optional<ObjectTypeField> objectTypeField() {
        return this.objectTypeField == null ? Optional.empty() : Optional.ofNullable(this.objectTypeField);
    }

    public ObjectTypeFieldMap(
        @Nullable String name,
        @Nullable ObjectTypeField objectTypeField) {
        this.name = name;
        this.objectTypeField = objectTypeField;
    }

    private ObjectTypeFieldMap() {
        this.name = null;
        this.objectTypeField = null;
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

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder objectTypeField(@Nullable ObjectTypeField objectTypeField) {
            this.objectTypeField = objectTypeField;
            return this;
        }        public ObjectTypeFieldMap build() {
            return new ObjectTypeFieldMap(name, objectTypeField);
        }
    }
}
