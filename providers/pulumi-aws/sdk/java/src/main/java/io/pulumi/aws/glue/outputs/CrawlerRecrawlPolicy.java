// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CrawlerRecrawlPolicy {
    /**
     * Specifies whether to crawl the entire dataset again or to crawl only folders that were added since the last crawler run. Valid Values are: `CRAWL_EVERYTHING` and `CRAWL_NEW_FOLDERS_ONLY`. Default value is `CRAWL_EVERYTHING`.
     * 
     */
    private final @Nullable String recrawlBehavior;

    @CustomType.Constructor
    private CrawlerRecrawlPolicy(@CustomType.Parameter("recrawlBehavior") @Nullable String recrawlBehavior) {
        this.recrawlBehavior = recrawlBehavior;
    }

    /**
     * Specifies whether to crawl the entire dataset again or to crawl only folders that were added since the last crawler run. Valid Values are: `CRAWL_EVERYTHING` and `CRAWL_NEW_FOLDERS_ONLY`. Default value is `CRAWL_EVERYTHING`.
     * 
    */
    public Optional<String> recrawlBehavior() {
        return Optional.ofNullable(this.recrawlBehavior);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CrawlerRecrawlPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String recrawlBehavior;

        public Builder() {
    	      // Empty
        }

        public Builder(CrawlerRecrawlPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recrawlBehavior = defaults.recrawlBehavior;
        }

        public Builder recrawlBehavior(@Nullable String recrawlBehavior) {
            this.recrawlBehavior = recrawlBehavior;
            return this;
        }        public CrawlerRecrawlPolicy build() {
            return new CrawlerRecrawlPolicy(recrawlBehavior);
        }
    }
}
