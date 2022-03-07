// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.servicecatalog;

import io.pulumi.awsnative.servicecatalog.enums.ServiceActionAcceptLanguage;
import io.pulumi.awsnative.servicecatalog.enums.ServiceActionDefinitionType;
import io.pulumi.awsnative.servicecatalog.inputs.ServiceActionDefinitionParameterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceActionArgs Empty = new ServiceActionArgs();

    @InputImport(name="acceptLanguage")
      private final @Nullable Input<ServiceActionAcceptLanguage> acceptLanguage;

    public Input<ServiceActionAcceptLanguage> getAcceptLanguage() {
        return this.acceptLanguage == null ? Input.empty() : this.acceptLanguage;
    }

    @InputImport(name="definition", required=true)
      private final Input<List<ServiceActionDefinitionParameterArgs>> definition;

    public Input<List<ServiceActionDefinitionParameterArgs>> getDefinition() {
        return this.definition;
    }

    @InputImport(name="definitionType", required=true)
      private final Input<ServiceActionDefinitionType> definitionType;

    public Input<ServiceActionDefinitionType> getDefinitionType() {
        return this.definitionType;
    }

    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public ServiceActionArgs(
        @Nullable Input<ServiceActionAcceptLanguage> acceptLanguage,
        Input<List<ServiceActionDefinitionParameterArgs>> definition,
        Input<ServiceActionDefinitionType> definitionType,
        @Nullable Input<String> description,
        @Nullable Input<String> name) {
        this.acceptLanguage = acceptLanguage;
        this.definition = Objects.requireNonNull(definition, "expected parameter 'definition' to be non-null");
        this.definitionType = Objects.requireNonNull(definitionType, "expected parameter 'definitionType' to be non-null");
        this.description = description;
        this.name = name;
    }

    private ServiceActionArgs() {
        this.acceptLanguage = Input.empty();
        this.definition = Input.empty();
        this.definitionType = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServiceActionAcceptLanguage> acceptLanguage;
        private Input<List<ServiceActionDefinitionParameterArgs>> definition;
        private Input<ServiceActionDefinitionType> definitionType;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptLanguage = defaults.acceptLanguage;
    	      this.definition = defaults.definition;
    	      this.definitionType = defaults.definitionType;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
        }

        public Builder setAcceptLanguage(@Nullable Input<ServiceActionAcceptLanguage> acceptLanguage) {
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        public Builder setAcceptLanguage(@Nullable ServiceActionAcceptLanguage acceptLanguage) {
            this.acceptLanguage = Input.ofNullable(acceptLanguage);
            return this;
        }

        public Builder setDefinition(Input<List<ServiceActionDefinitionParameterArgs>> definition) {
            this.definition = Objects.requireNonNull(definition);
            return this;
        }

        public Builder setDefinition(List<ServiceActionDefinitionParameterArgs> definition) {
            this.definition = Input.of(Objects.requireNonNull(definition));
            return this;
        }

        public Builder setDefinitionType(Input<ServiceActionDefinitionType> definitionType) {
            this.definitionType = Objects.requireNonNull(definitionType);
            return this;
        }

        public Builder setDefinitionType(ServiceActionDefinitionType definitionType) {
            this.definitionType = Input.of(Objects.requireNonNull(definitionType));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public ServiceActionArgs build() {
            return new ServiceActionArgs(acceptLanguage, definition, definitionType, description, name);
        }
    }
}