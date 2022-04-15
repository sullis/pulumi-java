// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RecordAlias {
    /**
     * Set to `true` if you want Route 53 to determine whether to respond to DNS queries using this resource record set by checking the health of the resource record set. Some resources have special requirements, see [related part of documentation](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/resource-record-sets-values.html#rrsets-values-alias-evaluate-target-health).
     * 
     */
    private final Boolean evaluateTargetHealth;
    /**
     * DNS domain name for a CloudFront distribution, S3 bucket, ELB, or another resource record set in this hosted zone.
     * 
     */
    private final String name;
    /**
     * Hosted zone ID for a CloudFront distribution, S3 bucket, ELB, or Route 53 hosted zone. See `resource_elb.zone_id` for example.
     * 
     */
    private final String zoneId;

    @CustomType.Constructor
    private RecordAlias(
        @CustomType.Parameter("evaluateTargetHealth") Boolean evaluateTargetHealth,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("zoneId") String zoneId) {
        this.evaluateTargetHealth = evaluateTargetHealth;
        this.name = name;
        this.zoneId = zoneId;
    }

    /**
     * Set to `true` if you want Route 53 to determine whether to respond to DNS queries using this resource record set by checking the health of the resource record set. Some resources have special requirements, see [related part of documentation](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/resource-record-sets-values.html#rrsets-values-alias-evaluate-target-health).
     * 
    */
    public Boolean evaluateTargetHealth() {
        return this.evaluateTargetHealth;
    }
    /**
     * DNS domain name for a CloudFront distribution, S3 bucket, ELB, or another resource record set in this hosted zone.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Hosted zone ID for a CloudFront distribution, S3 bucket, ELB, or Route 53 hosted zone. See `resource_elb.zone_id` for example.
     * 
    */
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecordAlias defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean evaluateTargetHealth;
        private String name;
        private String zoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(RecordAlias defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.evaluateTargetHealth = defaults.evaluateTargetHealth;
    	      this.name = defaults.name;
    	      this.zoneId = defaults.zoneId;
        }

        public Builder evaluateTargetHealth(Boolean evaluateTargetHealth) {
            this.evaluateTargetHealth = Objects.requireNonNull(evaluateTargetHealth);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder zoneId(String zoneId) {
            this.zoneId = Objects.requireNonNull(zoneId);
            return this;
        }        public RecordAlias build() {
            return new RecordAlias(evaluateTargetHealth, name, zoneId);
        }
    }
}
