// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.k8s.io_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * CustomResourceDefinitionNames indicates the names to serve this CustomResourceDefinition
 * 
 */
public final class CustomResourceDefinitionNamesArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomResourceDefinitionNamesArgs Empty = new CustomResourceDefinitionNamesArgs();

    /**
     * categories is a list of grouped resources this custom resource belongs to (e.g. 'all'). This is published in API discovery documents, and used by clients to support invocations like `kubectl get all`.
     * 
     */
    @InputImport(name="categories")
    private final @Nullable Input<List<String>> categories;

    public Input<List<String>> getCategories() {
        return this.categories == null ? Input.empty() : this.categories;
    }

    /**
     * kind is the serialized kind of the resource. It is normally CamelCase and singular. Custom resource instances will use this value as the `kind` attribute in API calls.
     * 
     */
    @InputImport(name="kind", required=true)
    private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    /**
     * listKind is the serialized kind of the list for this resource. Defaults to "`kind`List".
     * 
     */
    @InputImport(name="listKind")
    private final @Nullable Input<String> listKind;

    public Input<String> getListKind() {
        return this.listKind == null ? Input.empty() : this.listKind;
    }

    /**
     * plural is the plural name of the resource to serve. The custom resources are served under `/apis/<group>/<version>/.../<plural>`. Must match the name of the CustomResourceDefinition (in the form `<names.plural>.<group>`). Must be all lowercase.
     * 
     */
    @InputImport(name="plural", required=true)
    private final Input<String> plural;

    public Input<String> getPlural() {
        return this.plural;
    }

    /**
     * shortNames are short names for the resource, exposed in API discovery documents, and used by clients to support invocations like `kubectl get <shortname>`. It must be all lowercase.
     * 
     */
    @InputImport(name="shortNames")
    private final @Nullable Input<List<String>> shortNames;

    public Input<List<String>> getShortNames() {
        return this.shortNames == null ? Input.empty() : this.shortNames;
    }

    /**
     * singular is the singular name of the resource. It must be all lowercase. Defaults to lowercased `kind`.
     * 
     */
    @InputImport(name="singular")
    private final @Nullable Input<String> singular;

    public Input<String> getSingular() {
        return this.singular == null ? Input.empty() : this.singular;
    }

    public CustomResourceDefinitionNamesArgs(
        @Nullable Input<List<String>> categories,
        Input<String> kind,
        @Nullable Input<String> listKind,
        Input<String> plural,
        @Nullable Input<List<String>> shortNames,
        @Nullable Input<String> singular) {
        this.categories = categories;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.listKind = listKind;
        this.plural = Objects.requireNonNull(plural, "expected parameter 'plural' to be non-null");
        this.shortNames = shortNames;
        this.singular = singular;
    }

    private CustomResourceDefinitionNamesArgs() {
        this.categories = Input.empty();
        this.kind = Input.empty();
        this.listKind = Input.empty();
        this.plural = Input.empty();
        this.shortNames = Input.empty();
        this.singular = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceDefinitionNamesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> categories;
        private Input<String> kind;
        private @Nullable Input<String> listKind;
        private Input<String> plural;
        private @Nullable Input<List<String>> shortNames;
        private @Nullable Input<String> singular;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomResourceDefinitionNamesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categories = defaults.categories;
    	      this.kind = defaults.kind;
    	      this.listKind = defaults.listKind;
    	      this.plural = defaults.plural;
    	      this.shortNames = defaults.shortNames;
    	      this.singular = defaults.singular;
        }

        public Builder setCategories(@Nullable Input<List<String>> categories) {
            this.categories = categories;
            return this;
        }

        public Builder setCategories(@Nullable List<String> categories) {
            this.categories = Input.ofNullable(categories);
            return this;
        }

        public Builder setKind(Input<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder setListKind(@Nullable Input<String> listKind) {
            this.listKind = listKind;
            return this;
        }

        public Builder setListKind(@Nullable String listKind) {
            this.listKind = Input.ofNullable(listKind);
            return this;
        }

        public Builder setPlural(Input<String> plural) {
            this.plural = Objects.requireNonNull(plural);
            return this;
        }

        public Builder setPlural(String plural) {
            this.plural = Input.of(Objects.requireNonNull(plural));
            return this;
        }

        public Builder setShortNames(@Nullable Input<List<String>> shortNames) {
            this.shortNames = shortNames;
            return this;
        }

        public Builder setShortNames(@Nullable List<String> shortNames) {
            this.shortNames = Input.ofNullable(shortNames);
            return this;
        }

        public Builder setSingular(@Nullable Input<String> singular) {
            this.singular = singular;
            return this;
        }

        public Builder setSingular(@Nullable String singular) {
            this.singular = Input.ofNullable(singular);
            return this;
        }

        public CustomResourceDefinitionNamesArgs build() {
            return new CustomResourceDefinitionNamesArgs(categories, kind, listKind, plural, shortNames, singular);
        }
    }
}
