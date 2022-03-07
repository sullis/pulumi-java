// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.servicemanagement_v1.enums.ApiSyntax;
import io.pulumi.googlenative.servicemanagement_v1.inputs.MethodArgs;
import io.pulumi.googlenative.servicemanagement_v1.inputs.MixinArgs;
import io.pulumi.googlenative.servicemanagement_v1.inputs.OptionArgs;
import io.pulumi.googlenative.servicemanagement_v1.inputs.SourceContextArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Api is a light-weight descriptor for an API Interface. Interfaces are also described as "protocol buffer services" in some contexts, such as by the "service" keyword in a .proto file, but they are different from API Services, which represent a concrete implementation of an interface as opposed to simply a description of methods and bindings. They are also sometimes simply referred to as "APIs" in other contexts, such as the name of this message itself. See https://cloud.google.com/apis/design/glossary for detailed terminology.
 * 
 */
public final class ApiArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiArgs Empty = new ApiArgs();

    /**
     * The methods of this interface, in unspecified order.
     * 
     */
    @InputImport(name="methods")
      private final @Nullable Input<List<MethodArgs>> methods;

    public Input<List<MethodArgs>> getMethods() {
        return this.methods == null ? Input.empty() : this.methods;
    }

    /**
     * Included interfaces. See Mixin.
     * 
     */
    @InputImport(name="mixins")
      private final @Nullable Input<List<MixinArgs>> mixins;

    public Input<List<MixinArgs>> getMixins() {
        return this.mixins == null ? Input.empty() : this.mixins;
    }

    /**
     * The fully qualified name of this interface, including package name followed by the interface's simple name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Any metadata attached to the interface.
     * 
     */
    @InputImport(name="options")
      private final @Nullable Input<List<OptionArgs>> options;

    public Input<List<OptionArgs>> getOptions() {
        return this.options == null ? Input.empty() : this.options;
    }

    /**
     * Source context for the protocol buffer service represented by this message.
     * 
     */
    @InputImport(name="sourceContext")
      private final @Nullable Input<SourceContextArgs> sourceContext;

    public Input<SourceContextArgs> getSourceContext() {
        return this.sourceContext == null ? Input.empty() : this.sourceContext;
    }

    /**
     * The source syntax of the service.
     * 
     */
    @InputImport(name="syntax")
      private final @Nullable Input<ApiSyntax> syntax;

    public Input<ApiSyntax> getSyntax() {
        return this.syntax == null ? Input.empty() : this.syntax;
    }

    /**
     * A version string for this interface. If specified, must have the form `major-version.minor-version`, as in `1.10`. If the minor version is omitted, it defaults to zero. If the entire version field is empty, the major version is derived from the package name, as outlined below. If the field is not empty, the version in the package name will be verified to be consistent with what is provided here. The versioning schema uses [semantic versioning](http://semver.org) where the major version number indicates a breaking change and the minor version an additive, non-breaking change. Both version numbers are signals to users what to expect from different versions, and should be carefully chosen based on the product plan. The major version is also reflected in the package name of the interface, which must end in `v`, as in `google.feature.v1`. For major versions 0 and 1, the suffix can be omitted. Zero major versions must only be used for experimental, non-GA interfaces.
     * 
     */
    @InputImport(name="version")
      private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public ApiArgs(
        @Nullable Input<List<MethodArgs>> methods,
        @Nullable Input<List<MixinArgs>> mixins,
        @Nullable Input<String> name,
        @Nullable Input<List<OptionArgs>> options,
        @Nullable Input<SourceContextArgs> sourceContext,
        @Nullable Input<ApiSyntax> syntax,
        @Nullable Input<String> version) {
        this.methods = methods;
        this.mixins = mixins;
        this.name = name;
        this.options = options;
        this.sourceContext = sourceContext;
        this.syntax = syntax;
        this.version = version;
    }

    private ApiArgs() {
        this.methods = Input.empty();
        this.mixins = Input.empty();
        this.name = Input.empty();
        this.options = Input.empty();
        this.sourceContext = Input.empty();
        this.syntax = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<MethodArgs>> methods;
        private @Nullable Input<List<MixinArgs>> mixins;
        private @Nullable Input<String> name;
        private @Nullable Input<List<OptionArgs>> options;
        private @Nullable Input<SourceContextArgs> sourceContext;
        private @Nullable Input<ApiSyntax> syntax;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.methods = defaults.methods;
    	      this.mixins = defaults.mixins;
    	      this.name = defaults.name;
    	      this.options = defaults.options;
    	      this.sourceContext = defaults.sourceContext;
    	      this.syntax = defaults.syntax;
    	      this.version = defaults.version;
        }

        public Builder setMethods(@Nullable Input<List<MethodArgs>> methods) {
            this.methods = methods;
            return this;
        }

        public Builder setMethods(@Nullable List<MethodArgs> methods) {
            this.methods = Input.ofNullable(methods);
            return this;
        }

        public Builder setMixins(@Nullable Input<List<MixinArgs>> mixins) {
            this.mixins = mixins;
            return this;
        }

        public Builder setMixins(@Nullable List<MixinArgs> mixins) {
            this.mixins = Input.ofNullable(mixins);
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

        public Builder setOptions(@Nullable Input<List<OptionArgs>> options) {
            this.options = options;
            return this;
        }

        public Builder setOptions(@Nullable List<OptionArgs> options) {
            this.options = Input.ofNullable(options);
            return this;
        }

        public Builder setSourceContext(@Nullable Input<SourceContextArgs> sourceContext) {
            this.sourceContext = sourceContext;
            return this;
        }

        public Builder setSourceContext(@Nullable SourceContextArgs sourceContext) {
            this.sourceContext = Input.ofNullable(sourceContext);
            return this;
        }

        public Builder setSyntax(@Nullable Input<ApiSyntax> syntax) {
            this.syntax = syntax;
            return this;
        }

        public Builder setSyntax(@Nullable ApiSyntax syntax) {
            this.syntax = Input.ofNullable(syntax);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }
        public ApiArgs build() {
            return new ApiArgs(methods, mixins, name, options, sourceContext, syntax, version);
        }
    }
}