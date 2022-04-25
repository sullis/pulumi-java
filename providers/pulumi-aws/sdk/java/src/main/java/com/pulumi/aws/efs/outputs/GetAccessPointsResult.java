// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.efs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAccessPointsResult {
    /**
     * @return Set of Amazon Resource Names (ARNs).
     * 
     */
    private final List<String> arns;
    private final String fileSystemId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return Set of identifiers.
     * 
     */
    private final List<String> ids;

    @CustomType.Constructor
    private GetAccessPointsResult(
        @CustomType.Parameter("arns") List<String> arns,
        @CustomType.Parameter("fileSystemId") String fileSystemId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids) {
        this.arns = arns;
        this.fileSystemId = fileSystemId;
        this.id = id;
        this.ids = ids;
    }

    /**
     * @return Set of Amazon Resource Names (ARNs).
     * 
     */
    public List<String> arns() {
        return this.arns;
    }
    public String fileSystemId() {
        return this.fileSystemId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Set of identifiers.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessPointsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> arns;
        private String fileSystemId;
        private String id;
        private List<String> ids;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccessPointsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arns = defaults.arns;
    	      this.fileSystemId = defaults.fileSystemId;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
        }

        public Builder arns(List<String> arns) {
            this.arns = Objects.requireNonNull(arns);
            return this;
        }
        public Builder arns(String... arns) {
            return arns(List.of(arns));
        }
        public Builder fileSystemId(String fileSystemId) {
            this.fileSystemId = Objects.requireNonNull(fileSystemId);
            return this;
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
        }        public GetAccessPointsResult build() {
            return new GetAccessPointsResult(arns, fileSystemId, id, ids);
        }
    }
}
