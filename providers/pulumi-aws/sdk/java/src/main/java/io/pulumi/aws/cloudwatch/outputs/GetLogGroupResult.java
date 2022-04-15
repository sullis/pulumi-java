// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetLogGroupResult {
    /**
     * The ARN of the Cloudwatch log group
     * 
     */
    private final String arn;
    /**
     * The creation time of the log group, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     * 
     */
    private final Integer creationTime;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The ARN of the KMS Key to use when encrypting log data.
     * 
     */
    private final String kmsKeyId;
    private final String name;
    /**
     * The number of days log events retained in the specified log group.
     * 
     */
    private final Integer retentionInDays;
    /**
     * A map of tags to assign to the resource.
     * 
     */
    private final Map<String,String> tags;

    @CustomType.Constructor
    private GetLogGroupResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("creationTime") Integer creationTime,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kmsKeyId") String kmsKeyId,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("retentionInDays") Integer retentionInDays,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.arn = arn;
        this.creationTime = creationTime;
        this.id = id;
        this.kmsKeyId = kmsKeyId;
        this.name = name;
        this.retentionInDays = retentionInDays;
        this.tags = tags;
    }

    /**
     * The ARN of the Cloudwatch log group
     * 
    */
    public String arn() {
        return this.arn;
    }
    /**
     * The creation time of the log group, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     * 
    */
    public Integer creationTime() {
        return this.creationTime;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The ARN of the KMS Key to use when encrypting log data.
     * 
    */
    public String kmsKeyId() {
        return this.kmsKeyId;
    }
    public String name() {
        return this.name;
    }
    /**
     * The number of days log events retained in the specified log group.
     * 
    */
    public Integer retentionInDays() {
        return this.retentionInDays;
    }
    /**
     * A map of tags to assign to the resource.
     * 
    */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLogGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private Integer creationTime;
        private String id;
        private String kmsKeyId;
        private String name;
        private Integer retentionInDays;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLogGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.creationTime = defaults.creationTime;
    	      this.id = defaults.id;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.name = defaults.name;
    	      this.retentionInDays = defaults.retentionInDays;
    	      this.tags = defaults.tags;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder creationTime(Integer creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = Objects.requireNonNull(kmsKeyId);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder retentionInDays(Integer retentionInDays) {
            this.retentionInDays = Objects.requireNonNull(retentionInDays);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetLogGroupResult build() {
            return new GetLogGroupResult(arn, creationTime, id, kmsKeyId, name, retentionInDays, tags);
        }
    }
}
