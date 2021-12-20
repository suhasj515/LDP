import React, { useEffect, useState } from "react";
import { MyLibraryBanner } from "../organisms/MyLibraryBanner/MyLibraryBanner.js";
import AppBarTop from "../organisms/AppBarTop/AppBarTop.js";
import BottomPart from "../templets/BottomBooksgrid/BottomPart.js";

import GridCategoryBooks from "../organisms/GridCategoryBooks.js";
import axios from "axios";

export const MainComponent = () => {
  const [BookObj2, setBookObj2] = React.useState(null);
  const [BookObj, setBookObj] = React.useState(null);
  const [ExploreB, setExploreB] = React.useState(false);
  const [Category, setCategory] = React.useState("");
  const [load, setLoad] = useState(false);

  const [error, setError] = React.useState(false);

  useEffect(() => {
    axios.get("http://localhost:3000/bookList").then((res) => {
      setBookObj(res.data);
      setLoad(true);
      setBookObj2(res.data);
    });
  }, []);

  console.log(BookObj, "2apif");

  const [open, setOpen] = React.useState(false);
  const handleClickOpen = () => {
    setOpen(true);
    setError(false);
  };

  const handleClose = () => {
    setOpen(false);
  };
  var btitle = "";
  var bauthor = "";
  var burl = "";
  const [bcategory, setbcategory] = React.useState("Science");
  const bTitle = (e) => {
    btitle = e.target.value;
  };
  const bAuthor = (e) => {
    bauthor = e.target.value;
  };
  const bUrl = (e) => {
    burl = e.target.value;
  };
  const bCategory = (e) => {
    setbcategory(e.target.value);
  };

  const addBook = () => {
    setError(false);
    if (btitle === "") {
      setError(true);
    } else if (bauthor === "") {
      setError(true);
    } else if (burl === "") {
      setError(true);
    } else {
      const idc = BookObj.length + 1;
      console.log(idc, "lebiaskdjs");
      const extraBook = {
        id: idc,
        component: "img",
        width: "100%",
        objectFit: "fill",
        image: burl,
        alt: btitle + " by " + bauthor,
        titleBook: btitle,
        authorBook: bauthor,
        timeBook: "16-minute read",
        status: "Reading",
        category: bcategory,
      };

      axios
        .post("http://localhost:3000/bookList", {
          id: idc,
          component: "img",
          width: "100%",
          objectFit: "fill",
          image: burl,
          alt: btitle + " by " + bauthor,
          titleBook: btitle,
          authorBook: bauthor,
          timeBook: "16-minute read",
          status: "Reading",
          category: bcategory,
        })
        .then((res) => {
          console.log(res.status);
        });

      setBookObj((prevState) => [...prevState, extraBook]);
      setOpen(false);
    }
  };

  const onclickScience = () => {
    setExploreB(true);
    setCategory("Science");
  };

  const onclickEconomics = () => {
    setExploreB(true);
    setCategory("Economics");
  };
  const onclickPolitics = () => {
    setExploreB(true);
    setCategory("Politics");
  };

  if (!load) {
    return <div data-testid="loading">loading....</div>;
  } else {
    return (
      <div data-testid="loaded">
        <AppBarTop
          addBook={addBook}
          error={error}
          bTitle={bTitle}
          bAuthor={bAuthor}
          bcategory={bcategory}
          bCategory={bCategory}
          bUrl={bUrl}
          handleClickOpen={handleClickOpen}
          handleClose={handleClose}
          BookObj={BookObj}
          setBookObj={setBookObj}
          BookObj2={BookObj2}
          open={open}
          onclickScience={onclickScience}
          onclickEconomics={onclickEconomics}
          onclickPolitics={onclickPolitics}
          setExploreB={setExploreB}
        />
        <div>
          {ExploreB ? (
            <GridCategoryBooks
              category={Category}
              BookObj={BookObj}
              setBookObj={setBookObj}
            />
          ) : (
            <>
              <MyLibraryBanner />
              <BottomPart BookObj={BookObj} setBookObj={setBookObj} />{" "}
            </>
          )}
        </div>
      </div>
    );
  }
};
