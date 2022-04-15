// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudtrail.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFunctionResult {
    /**
     * Amazon Resource Name (ARN) identifying your CloudFront Function.
     * 
     */
    private final String arn;
    /**
     * Source code of the function
     * 
     */
    private final String code;
    /**
     * Comment.
     * 
     */
    private final String comment;
    /**
     * ETag hash of the function
     * 
     */
    private final String etag;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * When this resource was last modified.
     * 
     */
    private final String lastModifiedTime;
    private final String name;
    /**
     * Identifier of the function's runtime.
     * 
     */
    private final String runtime;
    private final String stage;
    /**
     * Status of the function. Can be `UNPUBLISHED`, `UNASSOCIATED` or `ASSOCIATED`.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private GetFunctionResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("code") String code,
        @CustomType.Parameter("comment") String comment,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lastModifiedTime") String lastModifiedTime,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("runtime") String runtime,
        @CustomType.Parameter("stage") String stage,
        @CustomType.Parameter("status") String status) {
        this.arn = arn;
        this.code = code;
        this.comment = comment;
        this.etag = etag;
        this.id = id;
        this.lastModifiedTime = lastModifiedTime;
        this.name = name;
        this.runtime = runtime;
        this.stage = stage;
        this.status = status;
    }

    /**
     * Amazon Resource Name (ARN) identifying your CloudFront Function.
     * 
    */
    public String arn() {
        return this.arn;
    }
    /**
     * Source code of the function
     * 
    */
    public String code() {
        return this.code;
    }
    /**
     * Comment.
     * 
    */
    public String comment() {
        return this.comment;
    }
    /**
     * ETag hash of the function
     * 
    */
    public String etag() {
        return this.etag;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * When this resource was last modified.
     * 
    */
    public String lastModifiedTime() {
        return this.lastModifiedTime;
    }
    public String name() {
        return this.name;
    }
    /**
     * Identifier of the function's runtime.
     * 
    */
    public String runtime() {
        return this.runtime;
    }
    public String stage() {
        return this.stage;
    }
    /**
     * Status of the function. Can be `UNPUBLISHED`, `UNASSOCIATED` or `ASSOCIATED`.
     * 
    */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String code;
        private String comment;
        private String etag;
        private String id;
        private String lastModifiedTime;
        private String name;
        private String runtime;
        private String stage;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFunctionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.code = defaults.code;
    	      this.comment = defaults.comment;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.name = defaults.name;
    	      this.runtime = defaults.runtime;
    	      this.stage = defaults.stage;
    	      this.status = defaults.status;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }
        public Builder comment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder runtime(String runtime) {
            this.runtime = Objects.requireNonNull(runtime);
            return this;
        }
        public Builder stage(String stage) {
            this.stage = Objects.requireNonNull(stage);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public GetFunctionResult build() {
            return new GetFunctionResult(arn, code, comment, etag, id, lastModifiedTime, name, runtime, stage, status);
        }
    }
}
