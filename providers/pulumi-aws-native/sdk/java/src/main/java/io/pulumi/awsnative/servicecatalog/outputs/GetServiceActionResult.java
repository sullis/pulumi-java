// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.servicecatalog.outputs;

import io.pulumi.awsnative.servicecatalog.enums.ServiceActionAcceptLanguage;
import io.pulumi.awsnative.servicecatalog.enums.ServiceActionDefinitionType;
import io.pulumi.awsnative.servicecatalog.outputs.ServiceActionDefinitionParameter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetServiceActionResult {
    private final @Nullable ServiceActionAcceptLanguage acceptLanguage;
    private final @Nullable List<ServiceActionDefinitionParameter> definition;
    private final @Nullable ServiceActionDefinitionType definitionType;
    private final @Nullable String description;
    private final @Nullable String id;
    private final @Nullable String name;

    @OutputCustomType.Constructor({"acceptLanguage","definition","definitionType","description","id","name"})
    private GetServiceActionResult(
        @Nullable ServiceActionAcceptLanguage acceptLanguage,
        @Nullable List<ServiceActionDefinitionParameter> definition,
        @Nullable ServiceActionDefinitionType definitionType,
        @Nullable String description,
        @Nullable String id,
        @Nullable String name) {
        this.acceptLanguage = acceptLanguage;
        this.definition = definition;
        this.definitionType = definitionType;
        this.description = description;
        this.id = id;
        this.name = name;
    }

    public Optional<ServiceActionAcceptLanguage> getAcceptLanguage() {
        return Optional.ofNullable(this.acceptLanguage);
    }
    public List<ServiceActionDefinitionParameter> getDefinition() {
        return this.definition == null ? List.of() : this.definition;
    }
    public Optional<ServiceActionDefinitionType> getDefinitionType() {
        return Optional.ofNullable(this.definitionType);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceActionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServiceActionAcceptLanguage acceptLanguage;
        private @Nullable List<ServiceActionDefinitionParameter> definition;
        private @Nullable ServiceActionDefinitionType definitionType;
        private @Nullable String description;
        private @Nullable String id;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceActionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptLanguage = defaults.acceptLanguage;
    	      this.definition = defaults.definition;
    	      this.definitionType = defaults.definitionType;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        public Builder setAcceptLanguage(@Nullable ServiceActionAcceptLanguage acceptLanguage) {
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        public Builder setDefinition(@Nullable List<ServiceActionDefinitionParameter> definition) {
            this.definition = definition;
            return this;
        }

        public Builder setDefinitionType(@Nullable ServiceActionDefinitionType definitionType) {
            this.definitionType = definitionType;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public GetServiceActionResult build() {
            return new GetServiceActionResult(acceptLanguage, definition, definitionType, description, id, name);
        }
    }
}
