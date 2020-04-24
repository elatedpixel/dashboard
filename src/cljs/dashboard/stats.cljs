(ns dashboard.stats
  (:require [reagent.core :as reagent :refer [atom]]))

(defn stats []
  [:div.column
   [:div.heading
    [:h1 "Social Media Dashboard"]
    [:p "Total Followers: 23,004"]]
   [:div.row
    [:div.tile
     [:h1 "1987"]
     [:p "followers"]
     [:span "^ 12 Today"]]]
   [:div.row
    [:div.sub-tile
     [:h1 "Retweets"]
     [:p "117"]]]])
