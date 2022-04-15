// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetUsersResult {
    /**
     * Set of ARNs of the matched IAM users.
     * 
     */
    private final List<String> arns;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable String nameRegex;
    /**
     * Set of Names of the matched IAM users.
     * 
     */
    private final List<String> names;
    private final @Nullable String pathPrefix;

    @CustomType.Constructor
    private GetUsersResult(
        @CustomType.Parameter("arns") List<String> arns,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("pathPrefix") @Nullable String pathPrefix) {
        this.arns = arns;
        this.id = id;
        this.nameRegex = nameRegex;
        this.names = names;
        this.pathPrefix = pathPrefix;
    }

    /**
     * Set of ARNs of the matched IAM users.
     * 
    */
    public List<String> arns() {
        return this.arns;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * Set of Names of the matched IAM users.
     * 
    */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> pathPrefix() {
        return Optional.ofNullable(this.pathPrefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUsersResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> arns;
        private String id;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String pathPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUsersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arns = defaults.arns;
    	      this.id = defaults.id;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.pathPrefix = defaults.pathPrefix;
        }

        public Builder arns(List<String> arns) {
            this.arns = Objects.requireNonNull(arns);
            return this;
        }
        public Builder arns(String... arns) {
            return arns(List.of(arns));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        public Builder pathPrefix(@Nullable String pathPrefix) {
            this.pathPrefix = pathPrefix;
            return this;
        }        public GetUsersResult build() {
            return new GetUsersResult(arns, id, nameRegex, names, pathPrefix);
        }
    }
}
