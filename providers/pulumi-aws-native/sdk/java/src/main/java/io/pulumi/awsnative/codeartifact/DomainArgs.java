// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.codeartifact;

import io.pulumi.awsnative.codeartifact.inputs.DomainTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainArgs Empty = new DomainArgs();

    /**
     * The name of the domain.
     * 
     */
    @Import(name="domainName")
      private final @Nullable Output<String> domainName;

    public Output<String> domainName() {
        return this.domainName == null ? Codegen.empty() : this.domainName;
    }

    /**
     * The access control resource policy on the provided domain.
     * 
     */
    @Import(name="permissionsPolicyDocument")
      private final @Nullable Output<Object> permissionsPolicyDocument;

    public Output<Object> permissionsPolicyDocument() {
        return this.permissionsPolicyDocument == null ? Codegen.empty() : this.permissionsPolicyDocument;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<DomainTagArgs>> tags;

    public Output<List<DomainTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public DomainArgs(
        @Nullable Output<String> domainName,
        @Nullable Output<Object> permissionsPolicyDocument,
        @Nullable Output<List<DomainTagArgs>> tags) {
        this.domainName = domainName;
        this.permissionsPolicyDocument = permissionsPolicyDocument;
        this.tags = tags;
    }

    private DomainArgs() {
        this.domainName = Codegen.empty();
        this.permissionsPolicyDocument = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> domainName;
        private @Nullable Output<Object> permissionsPolicyDocument;
        private @Nullable Output<List<DomainTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.permissionsPolicyDocument = defaults.permissionsPolicyDocument;
    	      this.tags = defaults.tags;
        }

        public Builder domainName(@Nullable Output<String> domainName) {
            this.domainName = domainName;
            return this;
        }
        public Builder domainName(@Nullable String domainName) {
            this.domainName = Codegen.ofNullable(domainName);
            return this;
        }
        public Builder permissionsPolicyDocument(@Nullable Output<Object> permissionsPolicyDocument) {
            this.permissionsPolicyDocument = permissionsPolicyDocument;
            return this;
        }
        public Builder permissionsPolicyDocument(@Nullable Object permissionsPolicyDocument) {
            this.permissionsPolicyDocument = Codegen.ofNullable(permissionsPolicyDocument);
            return this;
        }
        public Builder tags(@Nullable Output<List<DomainTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<DomainTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(DomainTagArgs... tags) {
            return tags(List.of(tags));
        }        public DomainArgs build() {
            return new DomainArgs(domainName, permissionsPolicyDocument, tags);
        }
    }
}
