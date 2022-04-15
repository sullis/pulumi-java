// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.aws.ec2.outputs.GetSubnetsFilter;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetSubnetsResult {
    private final @Nullable List<GetSubnetsFilter> filters;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * A list of all the subnet ids found.
     * 
     */
    private final List<String> ids;
    private final Map<String,String> tags;

    @CustomType.Constructor
    private GetSubnetsResult(
        @CustomType.Parameter("filters") @Nullable List<GetSubnetsFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.filters = filters;
        this.id = id;
        this.ids = ids;
        this.tags = tags;
    }

    public List<GetSubnetsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * A list of all the subnet ids found.
     * 
    */
    public List<String> ids() {
        return this.ids;
    }
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubnetsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetSubnetsFilter> filters;
        private String id;
        private List<String> ids;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubnetsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.tags = defaults.tags;
        }

        public Builder filters(@Nullable List<GetSubnetsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetSubnetsFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetSubnetsResult build() {
            return new GetSubnetsResult(filters, id, ids, tags);
        }
    }
}
